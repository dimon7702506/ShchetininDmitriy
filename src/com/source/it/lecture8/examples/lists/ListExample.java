package com.source.it.lecture8.examples.lists;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        List<String> strings = new LinkedList<>();
        strings.add("123");
        strings.add("123");
        strings.add("123");
        strings.add("XZS");
        strings.add("Adad");
        System.out.println(strings.size());
        System.out.println(strings.get(2));
        strings.add(3, "new");
        System.out.println(strings);
        System.out.println(strings.contains("123"));
        strings.remove(2);
        System.out.println(strings + " " + strings.size());
        strings.set(2, "newnew");
        System.out.println(strings + " " + strings.size());

        strings.add(0, "dsfgh");
        strings.add(strings.size() - 1, "dsfgh");

        for (String string : strings) {
            System.out.println(string);
        }
    }
}
