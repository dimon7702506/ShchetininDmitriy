package com.source.it.lecture4.examples;

public class RecursionExample {
    public static void main(String[] args) {
        /*for (;;) {
            System.out.println("Hello word!");
        }*/

        print(2);
    }

    public static void print(int counter) {
        if (counter > 0) {
            System.out.println("Before recursion, count = " + counter);
            print(counter - 1);
            System.out.println("After recursion, count = " + counter);
        }
    }

}
