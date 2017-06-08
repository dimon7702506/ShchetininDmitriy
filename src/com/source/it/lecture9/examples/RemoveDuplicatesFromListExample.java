package com.source.it.lecture9.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

import static java.util.Arrays.asList;

public class RemoveDuplicatesFromListExample {
    public static void main(String[] args) {
        List<User> users = asList(new User("John"), new User("Sara"),
                new User("Mike"), new User("David"), new User("Sara"),
                new User("Mike"), new User("David"));
        System.out.println(users);
        System.out.println("**************");
        users = new ArrayList<>(new LinkedHashSet<>(users));
        System.out.println(users);

    }
}
