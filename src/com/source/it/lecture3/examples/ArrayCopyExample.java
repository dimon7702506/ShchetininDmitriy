package com.source.it.lecture3.examples;

import java.util.Arrays;

public class ArrayCopyExample {
    public static void main(String[] args) {
        int[] oldArray = {5, 4, 3, 2, 1};
        int[] newArray = new int[5];

        //System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
        //System.arraycopy(oldArray, 1, newArray, 1, 3);
        System.arraycopy(oldArray, 1, newArray, 0, 3);
        System.out.println(Arrays.toString(newArray));
        System.arraycopy(newArray, 0, newArray, 2, 3);
        System.out.println(Arrays.toString(newArray));
    }
}
