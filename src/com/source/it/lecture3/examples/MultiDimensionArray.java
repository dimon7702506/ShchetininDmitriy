package com.source.it.lecture3.examples;

import java.util.Arrays;

public class MultiDimensionArray {
    public static void main(String[] args) {
        //int[][] matrix = new int[5][3];
        int[][] matrix = {
                {4, 2, 1, 6},
                {4, 2, 3},
                {7, 8, 1, 17, 25}
        };

        for (int[] array : matrix) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] != 1) {
                    array[j]++;
                } else {
                    array[j]++;
                    break;
                }
            }
            /*for (int elem : array) { Wrong!!!!
                if (elem != 1) {
                    elem++;
                    System.out.print(elem + " ");
                } else {
                    elem++;
                    System.out.print(elem + " ");
                    break;
                }
            }
            System.out.println();*/
        }

        for (int[] array : matrix) {
            System.out.println(Arrays.toString(array));
        }
    }
}
