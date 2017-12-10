package com.example.thomas.firebasechat;


public class User {

    public String name;
    public String email;

    public User(String name, String email){

        this.name = name;
        this.email = email;
    }

    public String getName(){

        return this.name;
    }

    public String getEmail(){

        return this.email;
    }

}
