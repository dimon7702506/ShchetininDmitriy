package com.source.it.lecture3.homework;

import java.util.Arrays;

public class YourOwnBinarySearch {
    static int[] array = {100, 1, 1, 4, 7, 10, 17, 30, 48};
    static int element = 10;

    public static void main(String[] args) {
        System.out.println(binarySearch(array, element));
    }

    private static int binarySearch(int[] array, int elem) {
        int result = -1;
        /* Your code here */

        for (int j = 1; j < array.length; j++) {
            int temp = array[j];
            int i = j - 1;

            while (i >= 0 && array[i] > temp) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = temp;
        }

        int left = 0;
        int right = array.length - 1;

        while (right - left > 1){
            int mid = left + (right - left) / 2;
            if (array[mid] <= elem) {
                left = mid;
            } else {
                right = mid;
            }
            //System.out.println(left + " " + right);
        }
        for (int i = left; i <= right; i++){
            if (array[i] == elem){
                result = i;
            }
        }
        return result;
    }

}
