package com.source.it.lecture2.examples;

public class ConditionExample {
    public static void main(String[] args) {
        int i = 11;
        int j = 24;
        boolean b = false;
        if (b) {
            System.out.println("b is true");
        }

        if (i > 10 && j > 25) {
            i = -i;
            j *= 10;
        } else if (b) {
            i *= 10;
            j = -j;
        } else {
            System.out.println("Don't know what to do");
        }

        System.out.println("i is equals to " + i);
        System.out.println("j is equals to " + j);

    }
}
