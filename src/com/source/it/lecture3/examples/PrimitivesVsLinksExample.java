package com.source.it.lecture3.examples;

import com.source.it.lecture2.examples.oop.User;

public class PrimitivesVsLinksExample {
    public static void main(String[] args) {
        int a = 1;
        User user = new User();
        user.setName("John");
        user.setLastName("Smith");



        increment(a);
        changeName(user, "Mike");
        System.out.println("a = " + a);
        System.out.println(user);
    }

    private static void increment(int a) {
        a++;
    }

    private static void changeName(User user, String newName) {
        user.setName(newName);
    }
}
