package com.source.it.lecture8.examples.sets;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> strings = new HashSet<>(32);
        System.out.println(strings.add("123"));
        strings.add("123");
        strings.add("123");
        strings.add("XZS");
        strings.add("Adad");

        strings.remove("123");

        //System.out.println(strings);
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
