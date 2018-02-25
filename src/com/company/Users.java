package com.company;

import java.util.ArrayList;
import java.util.List;

public class Users {
    private final int count = 110;
    private List<User> users = new ArrayList<User>();

    public void populate(){
        for (int i = 0; i < count; i++){
            users.add(new Parser().getUserFromJSON());
        }
    }

    public List<User> get(){
        return users;
    }
}