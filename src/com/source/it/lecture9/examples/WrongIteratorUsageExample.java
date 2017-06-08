package com.source.it.lecture9.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WrongIteratorUsageExample {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("ab");
        strings.add("ba");
        strings.add("aab");
        for (String string : strings) {
            if (string.startsWith("a")) {
                strings.remove(string);//Wrong no changes to collection during iteration
            }
        }
        System.out.println(strings);
    }
}
