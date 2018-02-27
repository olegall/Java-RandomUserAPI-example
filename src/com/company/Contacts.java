package com.company;

final class Contacts {

    private final String email;
    private final String phone;
    private final Address address;

    Contacts(String email, String phone, Address address) {
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public Address getAddress() {
        return address;
    }
}