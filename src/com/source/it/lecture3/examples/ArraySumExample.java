package com.source.it.lecture3.examples;

import com.source.it.lecture2.examples.oop.User;

public class ArraySumExample {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5};

        System.out.println(arraySumForEach(array));
    }

    private static int arraySum(int[] array) {
        int result = 0;
        for (int index = 0; index < array.length; index++) {
            result += array[index];
        }

        return result;
    }

    private static int arraySumForEach(int[] array) {
        int result = 0;
        for (int elem : array) {
            result += elem;
        }

        return result;
    }

    private static User[] getUsers() {
        /*Some logic*/
        return new User[0];
    }
}
