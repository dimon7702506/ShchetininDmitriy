package com.source.it.lecture12.homeworks;

import java.util.Random;

public class NewSorter {

    public static void main( String[] args ) {

        int[] array = createArray();

        long startTime = System.currentTimeMillis();

        MultiMerger multiMerger = new MultiMerger(array);
        multiMerger.start();
        try {
            multiMerger.join();
        } catch ( Exception e ) {}

        long endTime = System.currentTimeMillis();

        System.out.println("Merge sort took " + (endTime - startTime) + " ms");
    }

    private static int[] createArray() {
        Random random = new Random();
        int[] result = new int[10000000];
        for (int index = 0; index < result.length; index++) {
            result[index] = random.nextInt(1000);
        }
        return result;
    }
}