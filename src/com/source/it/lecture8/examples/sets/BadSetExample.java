package com.source.it.lecture8.examples.sets;

import com.source.it.lecture8.examples.lists.SimpleClass;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class BadSetExample {
    public static void main(String[] args) {
        Set<SimpleClass> set = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            SimpleClass sc = new SimpleClass();
            sc.setI(new Random().nextInt(10));
            sc.setStr("" + new Random().nextInt(10));
            System.out.println(sc);
            set.add(sc);
        }

        HashSet<SimpleClass> simpleClasses = new HashSet<>(set);

        System.out.println(set.size() + " " + set);
        System.out.println(simpleClasses);
    }
}
