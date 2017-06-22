package com.source.it.lecture3.homework;

import java.util.Arrays;

public class MatrixMultiplier {
    public static void main(String[] args) {
        int[][] first = {
                {1, 2, 3, 4},
                {3, 4, 5, 6},
                {7, 5, 4, 1}
        };

        int[][] second = {
                {1, 2, 3},
                {3, 4, 6},
                {7, 5, 1},
                {3, 4, 6}
        };
        if (first.length == second[0].length && first[0].length == second.length) {
            int[][] result = new int[first.length][second[0].length];

            for (int i = 0; i < first.length; i++) {
                for (int j = 0; j < second[0].length; j++) {
                    for (int k = 0; k < second.length; k++) {
                        result[i][j] += first[i][k] * second[k][j];
                    }
                }
            }
            PrintArray(result);
        } else {
            System.err.println("Error!!!");
        }
    }

    public static void PrintArray(int [][] array) {
        for (int[] elem : array) {
            System.out.println(Arrays.toString(elem));
        }
    }
}
