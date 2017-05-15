package com.source.it.lecture3.homework;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] array = {5, 7, 9, 15, -10, -1, 8, 45, 1, 1};

        /*Your code here*/
        for (int j = 1; j < array.length; j++) {
            int temp = array[j];
            int i = j - 1;

            while (i >= 0 && array[i] > temp) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
