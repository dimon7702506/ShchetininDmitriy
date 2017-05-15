package com.source.it.lecture3.examples;

import java.util.Arrays;

public class BubbleSortExample {
    public static void main(String[] args) {
        int[] array = {5, 2, 4, 3, 7, 9};
        bubbleSort(array);

        System.out.println(Arrays.toString(array));

    }

    public static void bubbleSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
