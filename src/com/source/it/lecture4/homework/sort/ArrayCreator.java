package com.source.it.lecture4.homework.sort;

import java.util.Random;

public class ArrayCreator {
    public static int[] createHugeArray(int n) {
        Random random = new Random();
        int[] result = new int[random.nextInt(1_000_00) + 1_000_00];
        //int[] result = new int[random.nextInt(10) + 10];
        for(int index = 0; index < result.length; index++) {
            result[index] = random.nextInt(n);
        }
        return result;
    }
}
