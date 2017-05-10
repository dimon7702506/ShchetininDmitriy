package com.source.it.lecture2.examples.oop;

public class UserExample {
    public static void main(String[] args) {
        User user = new User();
        /*user.age = 25;
        user.name = "John";
        user.lastName = "Smith";*/
        user.setAge(25);
        user.setName("John");
        user.setLastName("Smith");
        /*int age = user.getAge();
        age = 20;
        String name = user.getName();
        name = "Mike";*/

        user.greet();

        User newUser = new User();
        newUser.setAge(25);
        newUser.setName("John");
        newUser.setLastName("Smith");



        System.out.println(user == newUser);
        System.out.println(user.equals(newUser));


    }
}
