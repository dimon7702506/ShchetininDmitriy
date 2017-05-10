package com.source.it.lecture2.examples;

public class LoopExample {
    public static void main(String[] args) {
        /*System.out.println("Hello World 1 time");
        System.out.println("Hello World 2 time");
        System.out.println("Hello World 3 time");*/

        for (int i = 0; i < 3; i++) {
            System.out.println("Hello World " + (i + 1) + " time");
        }

        int j = 0;

        for(;; j++) {
            if (j > 2) {
                break;
            }
            System.out.println("Bye-bye");
        }
    }
}
