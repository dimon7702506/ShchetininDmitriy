package com.source.it.lecture7.examples.exceptions;

public class ExceptionsExample {
    public static void main(String[] args)  {
        //int x = 5 / 0;
        //int[] x = {1};
        //System.out.println(x[5]);

        try {
            System.out.println("Before exception");
            throw new Throwable();
        } catch (Throwable t) {
            System.out.println("Exception caught");
            System.exit(0);
        } finally {
            System.out.println("Always!");
        }
    }
}
