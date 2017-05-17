package com.source.it.lecture4.homework.sort;

import java.util.Arrays;

public class HugeArraySorter {
    public static void main(String[] args) {
        int[] hugeArray = ArrayCreator.createHugeArray(10);
        int[] nullHugeArray = new int[hugeArray.length];

             /*Your implementation here*/
        /*System.out.println(Arrays.toString(hugeArray));*/

        for (int index = 0; index < hugeArray.length; index++){
            nullHugeArray[hugeArray[index]] ++;
        }

        /*System.out.println(Arrays.toString(nullHugeArray));*/

        int j = 0;

        for (int index = 0; index < nullHugeArray.length ; index++) {
            int count = nullHugeArray[index];
            if (count > 0) {
                for (int i = 1; i <= count; i++){
                    hugeArray[j] = index;
                    j++;
                }
            }
        }
        /*System.out.println(Arrays.toString(hugeArray));*/

        for (int index = 0; index < hugeArray.length - 1; index++) {
            if (hugeArray[index] > hugeArray[index + 1]) {
                System.out.println("Sort failed!!!");
                return;
            }
        }

        System.out.println("Sort successful!!");
    }
}
