package com.company;

import gherkin.deps.com.google.gson.JsonElement;
import gherkin.deps.com.google.gson.JsonParser;

public class Parser {
    //private Logger logger = new Logger();

    public User getUserFromJSON() {
        JsonElement jsonTree = new JsonParser().parse(new HttpClient().getResponse().toString());
        if(jsonTree.isJsonObject()){
            JsonElement results = jsonTree.getAsJsonObject().get("results");
            if(results.isJsonArray()){
                JsonElement name = getArrayObject(results,"name");
                JsonElement firstName = getValue(name, "first");
                JsonElement lastName = getValue(name, "last");

                JsonElement email = getArrayObject(results,"email");
                JsonElement phone = getArrayObject(results,"phone");
                JsonElement nationality = getArrayObject(results,"nat");

                JsonElement location = getArrayObject(results,"location");
                JsonElement state = getValue(location, "state");
                JsonElement city = getValue(location, "city");
                JsonElement street = getValue(location, "street");

                //System.out.println("||| " + firstName + lastName + email + phone + nationality + state + city + street);
                return new User(firstName.toString(), lastName.toString(), email.toString(), phone.toString(),
                                nationality.toString(), state.toString(), city.toString(), street.toString());
            }
        }
        Logger.logJsonChanged();
        return null;
    }

    private JsonElement getArrayObject(JsonElement array, String objectName){
        return array.getAsJsonArray().get(0).getAsJsonObject().get(objectName);
    }

    private JsonElement getValue(JsonElement object, String objectName){
        if(object.isJsonObject()) {
            return object.getAsJsonObject().get(objectName);
        }
        Logger.logJsonChanged();
        return null;
    }
}
