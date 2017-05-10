package com.source.it.lecture2.examples.oop;

public class ImmutableUser {
    private String name;
    private String lastName;
    private int age;

   /* public ImmutableUser () {

    }*/

    public ImmutableUser(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public ImmutableUser(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void greet() {
        System.out.println("I'm " + name + " " + lastName
                + " . And I'm " + age + " years old.");

    }

    public static void sayHi() {
        System.out.println("Hi");
    }
}
