package com.source.it.lecture5.examples.oop.users;

public class User {
    protected String name;

    /*public User() {
        System.out.println("Hi");
    }*/

    public User(String name) {
        //this();
        this.name = name;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
