package com.source.it.lecture3.homework;

import java.util.Arrays;

public class MatrixInverter {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4},
                {3, 4, 5, 6},
                {7, 7, 4, 1},
                {7, 5, 4, 1}
        };
        /* Your code here */

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                int temp = array[i][j];
                array[i][j] = array [j][i];
                array[j][i] = temp;
            }
        }

        PrintArray(array);
      }

    public static void PrintArray(int [][] array) {
        for (int[] elem : array) {
            System.out.println(Arrays.toString(elem));
        }
    }
}