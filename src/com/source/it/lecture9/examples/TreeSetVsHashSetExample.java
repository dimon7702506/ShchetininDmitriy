package com.source.it.lecture9.examples;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetVsHashSetExample {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("cddd");
        hashSet.add("xxxx");
        hashSet.add("abb");
        hashSet.add("abbc");
        System.out.println(hashSet);

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("cddd");
        treeSet.add("xxxx");
        treeSet.add("abb");
        treeSet.add("abbc");

        System.out.println(treeSet);

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("cddd");
        linkedHashSet.add("xxxx");
        linkedHashSet.add("abb");
        linkedHashSet.add("abbc");

        System.out.println(linkedHashSet);

    }
}
