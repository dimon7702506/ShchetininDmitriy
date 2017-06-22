package com.source.it.lecture11.examples.serialization;

import java.io.Serializable;

public class Address implements Cloneable, Serializable {
    private String street;
    private int apt;
    private String city;

    public Address(String street, int apt, String city) {
        this.street = street;
        this.apt = apt;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getApt() {
        return apt;
    }

    public void setApt(int apt) {
        this.apt = apt;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", apt=" + apt +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public Address clone() throws CloneNotSupportedException {
        return (Address) super.clone();
    }
}
