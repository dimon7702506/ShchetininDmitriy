package com.source.it.lecture3.homework;

import java.util.Arrays;

public class MatrixPrinter {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2000, 3,    4},
            {3, 4,    5250, 6000000},
            {7, 5,    4,    1}
        };
        /* Your code here */

        int max = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }

        int max_len = String.valueOf(max).length();
        max_len ++;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.format("%" + max_len + "d", array[i][j]);
            }
            System.out.println();
        }
    }
}
