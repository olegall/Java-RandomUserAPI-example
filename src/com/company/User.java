package com.company;

final class User {

    private final String firstName;
    private final String lastName;
    private final String nationality;
    private final Contacts contacts;
    private final Picture picture;

    public User (String firstName,
                 String lastName,
                 String nationality,
                 Contacts contacts,
                 Picture picture){
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
        this.contacts = contacts;
        this.picture = picture;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getNationality(){
        return nationality;
    }

    public Contacts getContacts() {
        return contacts;
    }

    public Picture getPicture() {
        return picture;
    }
}