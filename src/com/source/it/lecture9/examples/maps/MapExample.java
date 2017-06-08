package com.source.it.lecture9.examples.maps;


import com.source.it.lecture9.examples.User;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, User> map = new TreeMap<>();
        User user1 = new User("Peter");
        User user2 = new User("Peter");
        User user3 = new User("John");
        User user4 = new User("Mike");

        System.out.println(map.put(1, user1));
        System.out.println(map.put(17, user2));
        System.out.println(map.put(9, user3));
        System.out.println(map.put(24, user4));

        System.out.println(map);
        Set<Integer> integers = map.keySet();
        for (Integer integer : integers) {
            System.out.println(integer + " --> " + map.get(integer));
        }

        Set<Map.Entry<Integer, User>> entries = map.entrySet();
        for (Map.Entry<Integer, User> entry : entries) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }

        for (User user : map.values()) {
            System.out.println(user);
        }

    }
}
