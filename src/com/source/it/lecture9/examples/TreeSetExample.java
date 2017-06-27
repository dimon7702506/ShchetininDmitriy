package com.source.it.lecture9.examples;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        //Set<User> users = new HashSet<>();
        Set<User> users = new TreeSet<>(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        users.add(new User("Peter"));
        users.add(new User("John"));
        users.add(new User("Mike"));
        users.add(new User("John"));
        System.out.println(users);

    }
}
