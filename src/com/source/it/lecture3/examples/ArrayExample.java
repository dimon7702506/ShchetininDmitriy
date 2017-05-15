package com.source.it.lecture3.examples;

import com.source.it.lecture2.examples.oop.User;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] array = new int[5];
        System.out.println(array.length);
        array[0] = 1;
        array[1] = 5;
        array[2] = 4;
        array[3] = 10;
        System.out.println(Arrays.toString(array));

        User[] users = new User[3];

        System.out.println(Arrays.toString(users));

        int[] newArray = {1, 5, 10, 20, 17, -1};
        System.out.println(Arrays.toString(newArray));
        System.out.println(newArray.length);


    }
}
