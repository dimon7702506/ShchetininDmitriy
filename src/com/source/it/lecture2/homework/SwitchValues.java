package com.source.it.lecture2.homework;

public class SwitchValues {
    public static void main(String[] args) {
        int first = 5;
        int second = 10;
        /*int temp = first;
        first = second;
        second = temp;*/

        /*Your implementation*/
        second += first;
        first = second - first;
        second = second - first;

        System.out.println("First = " + first + " , second = " + second);
    }
}
