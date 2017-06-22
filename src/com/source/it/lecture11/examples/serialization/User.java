package com.source.it.lecture11.examples.serialization;

import java.io.Serializable;
import java.util.Arrays;

public class User implements Cloneable, Serializable {
    private String name;
    private String lastName;
    private /*transient*/ int[] birthday;
    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int[] getBirthday() {
        return birthday;
    }

    public void setBirthday(int[] birthday) {
        if (birthday.length != 3) {
            throw new IllegalArgumentException("Birthday array should have 3 elements!");
        }
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + (birthday == null ? birthday :  birthday[0] + "-" + birthday[1] + "-" + birthday[2]) +
                ", address=" + address +
                '}';
    }

    @Override
    public User clone() throws CloneNotSupportedException {
        User clone = (User) super.clone();
        clone.setBirthday(Arrays.copyOf(birthday, birthday.length));
        clone.setAddress(address.clone());
        //return (User) super.clone();
        return clone;
    }
}
