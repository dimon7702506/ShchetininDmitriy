package com.source.it.lecture7.examples.exceptions;

public class ExcetionInExceptionExample {
    public static void main(String[] args) {
        /*try {
            try {
                throw new RuntimeException("RtE");
            } catch (RuntimeException e) {
                throw new Exception(e);
            }
        } catch (Exception e1) {
            e1.printStackTrace();
        }*/

        try {
            throw new NullPointerException();
        } catch (Error | Exception e) {
            System.out.println(e.getClass().getSimpleName() + " caught");
        }
    }
}
