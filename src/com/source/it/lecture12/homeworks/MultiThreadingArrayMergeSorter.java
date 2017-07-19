package com.source.it.lecture12.homeworks;

import java.util.Arrays;
import java.util.Random;

public class MultiThreadingArrayMergeSorter {

    public static void main(String[] args) {
        int[] array = createArray();

        long startTime = System.currentTimeMillis();
        int[] result = mergeSort(array);

        long endTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(result));
        System.out.println("Merge sort took " + (endTime - startTime) + " ms");
    }

    public static int[] mergeSort(int[] array) {
        return doMergeSort(
                Arrays.copyOfRange(array, 0, array.length / 2),
                Arrays.copyOfRange(array, array.length / 2, array.length));
    }

    public static int[] doMergeSort(int[] left, int[] right) {

        if (left.length > 1) {
            left = doMergeSort(Arrays.copyOfRange(left, 0, left.length / 2),
                    Arrays.copyOfRange(left, left.length / 2, left.length));
        }
        if (right.length > 1) {
            right = doMergeSort(Arrays.copyOfRange(right, 0, right.length / 2),
                    Arrays.copyOfRange(right, right.length / 2, right.length));
        }
        int[] result = new int[left.length + right.length];
        int leftIndex = 0;
        int rightIndex = 0;

        for (int index = 0; index < result.length; index++) {
            if (leftIndex > left.length - 1) {
                System.arraycopy(right, rightIndex, result, index, result.length - index);
                break; //for
            }
            if (rightIndex > right.length - 1) {
                System.arraycopy(left, leftIndex, result, index, result.length - index);
                break; //for
            }
            if (left[leftIndex] > right[rightIndex]) {
                result[index] = right[rightIndex++];
            } else {
                result[index] = left[leftIndex++];
            }
        }
        return result;
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
