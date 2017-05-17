package com.source.it.lecture4.examples;

import java.util.Arrays;

public class ArrayMergeSorter {
    public static void main(String[] args) {
        int[] array = {7, 3, 5, 6, 12, 4, 1};

        int[] result = mergeSort(array);

        System.out.println(Arrays.toString(result));
    }

    public static int[] mergeSort(int[] array) {
        return doMergeSort(
                Arrays.copyOfRange(array, 0, array.length / 2),
                Arrays.copyOfRange(array, array.length / 2, array.length));
    }

    private static int[] doMergeSort(int[] left, int[] right) {
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
}
