package com.company;

import java.util.ArrayList;
import java.util.List;

public class Users {

    private int count;
    public Users(int count){
        this.count = count;
    }

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