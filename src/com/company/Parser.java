package com.company;

import gherkin.deps.com.google.gson.JsonElement;
import gherkin.deps.com.google.gson.JsonParser;

final class Parser {
    public User getUserFromJSON() {
        StringBuffer httpResponse =  new HttpClient("https://randomuser.me/api/").getResponse();
        JsonElement jsonTree = new JsonParser().parse(httpResponse.toString());
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

                JsonElement picture = getArrayObject(results,"picture");
                JsonElement thumbnail = getValue(picture, "thumbnail");
                JsonElement large = getValue(picture, "large");

                Address address = new Address(state.toString(), city.toString(), street.toString());
                Contacts contacts = new Contacts(email.toString(), phone.toString(), address);
                Picture pictureObj = new Picture(thumbnail.toString(), large.toString());
                return new User(firstName.toString(), lastName.toString(), nationality.toString(), contacts, pictureObj);
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
