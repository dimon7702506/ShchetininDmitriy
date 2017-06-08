package com.source.it.lecture9.examples;

public class User implements Comparable<User> {
    protected String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return name.equals(user.getName());
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(User user) {
        //return this.name.compareTo(user.name);
        return user.name.compareTo(this.name);
    }
}
