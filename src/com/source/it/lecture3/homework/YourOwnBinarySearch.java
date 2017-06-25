package com.source.it.lecture3.homework;

import java.util.Arrays;

public class YourOwnBinarySearch {
    static int[] array = {1, 1, 4, 7, 10, 17, 30, 48};
    static int element = 30;

    public static void main(String[] args) {
        System.out.println(binarySearch(array, element));
    }

    private static int binarySearch(int[] array, int elem) {
        int result = -1;
        /* Your code here */

        int left = 0;
        int right = array.length - 1;

        while (right - left > 1){
            //int mid = left + (right - left) / 2;  если left + right > int
            int mid = (left + right) / 2;
            if (array[mid] < elem) {
                left = mid;
            } else if (array[mid] == elem){
                result = mid;
                return result;
            } else {
                right = mid;
            }
            //System.out.println(left + " " + right);
        }
        return result;
    }
}
