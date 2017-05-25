package com.source.it.lecture5.examples.oop.users;

public class SuperUser  extends User {

    public SuperUser(String name) {
        super(name);
        this.name = "Super " + name;

    }
}
