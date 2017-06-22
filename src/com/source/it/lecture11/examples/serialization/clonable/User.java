package com.source.it.lecture11.examples.serialization.clonable;

public class User implements Cloneable {
    private int age;
    private String name;
    private String lastName;
    private Address address;

    public User(int age, String name, String lastName, Address address) {
        this.age = age;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

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

    public User copy() {
        return new User(this.getAge(), this.getName(), this.getLastName(), this.getAddress());
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Address address = (Address)this.getAddress().clone();
        User user = (User)super.clone();
        user.setAddress(address);
        return user;
    }
}
