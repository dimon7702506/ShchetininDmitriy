package com.source.it.lecture7.examples.exceptions;

public class MyException extends Exception{
    private static int count = 0;

    public MyException() {
        super();
        count++;
    }

    public MyException(String message) {
        super(message);
        count++;
    }

    public static int getCount() {
        return count;
    }
}
