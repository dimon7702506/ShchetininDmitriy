package com.source.it.lecture2.examples;

public class WhileExamples {
    public static void main(String[] args) {
        int i = 4;

        while (i < 3) {
            i++;
            System.out.println("Hello!");
        }

        do {
            i++;
            System.out.println("Bye-bye!");
        } while (i < 3);
    }
}
