package com.source.it.lecture4.homework.sort;

import java.util.Arrays;

public class HugeArraySorter {
    public static void main(String[] args) {
        int[] hugeArray = ArrayCreator.createHugeArray(10);

        /*Your implementation here*/
        System.out.println(Arrays.toString(hugeArray));
        for (int index = 0; index < hugeArray.length - 1; index++){

        }

        for (int index = 0; index < hugeArray.length - 1; index++) {
            if (hugeArray[index] > hugeArray[index + 1]) {
                System.out.println("Sort failed!!!");
                return;
            }
        }

        System.out.println("Sort successful!!");
    }
}
