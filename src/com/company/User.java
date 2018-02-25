package com.company;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String nationality;
    private String state;
    private String city;
    private String street;

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getEmail(){
        return email;
    }
    public String getPhone(){
        return phone;
    }
    public String getNationality(){
        return nationality;
    }
    public String getState(){
        return state;
    }
    public String getCity(){
        return city;
    }
    public String getStreet(){
        return street;
    }

    public User (String firstName,
                 String lastName,
                 String email,
                 String phone,
                 String nationality,
                 String state,
                 String city,
                 String street){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.nationality = nationality;
        this.state = state;
        this.city = city;
        this.street = street;
    }
}


