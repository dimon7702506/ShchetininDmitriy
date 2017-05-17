package com.source.it.lecture4.examples;


import com.source.it.lecture3.examples.BubbleSortExample;
import com.source.it.lecture4.homework.sort.ArrayCreator;

public class MergeVsBubleSortTest {
    public static void main(String[] args) {
        int[] hugeArrayForBubble = ArrayCreator.createHugeArray(10000);
        int[] hugeArrayForMerge = new int[hugeArrayForBubble.length];
        System.arraycopy(hugeArrayForBubble, 0, hugeArrayForMerge, 0, hugeArrayForBubble.length);

        long startMerge = System.currentTimeMillis();
        ArrayMergeSorter.mergeSort(hugeArrayForMerge);
        long endMerge = System.currentTimeMillis();

        System.out.println("Merge took " + (endMerge - startMerge) + " ms");

        long startBubble = System.currentTimeMillis();
        BubbleSortExample.bubbleSort(hugeArrayForBubble);
        long endBubble = System.currentTimeMillis();

        System.out.println("Bubble took " + (endBubble - startBubble) + " ms");
    }

}
