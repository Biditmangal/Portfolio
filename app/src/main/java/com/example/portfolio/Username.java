package com.example.portfolio;

public class Username {

    public String email;
    public String name;

    public Username(String name , String email){
        this.email = email;
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
   }

    public void setName(String name){
        this.name = name;
   }
    public String getName(){
        return this.name;
   }
}

