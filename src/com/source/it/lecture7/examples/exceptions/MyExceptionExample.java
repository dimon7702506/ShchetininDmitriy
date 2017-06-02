package com.source.it.lecture7.examples.exceptions;

import java.util.Random;

public class MyExceptionExample {
    static Random random = new Random(100);

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            try {
                doSomethingRisky();
            } catch (MyException e) {
                System.out.println("Failed because " + e.getMessage());
                //e.printStackTrace();
            }
        }
    }

    static void doSomethingRisky() throws MyException {
        int cause;
        if ((cause = random.nextInt(100)) < 25) {
            throw new MyException("Cause = " + cause);
        }
        System.out.println("We are good, cause = " + cause);
    }
}
