package com.source.it.lecture7.examples.exceptions;

public class FinallyExample {
    public static void main(String[] args) {
       /* try {
            //int i = 1 / 0;
            throw new RuntimeException();
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught");
            Class clazz = e.getClass();
            if ("ArithmeticException".equals(clazz.getSimpleName())) {
            *//*if (e instanceof ArithmeticException) {*//*
                System.out.println("And it's arithmetic!");
            }
            System.exit(0);
        } finally {
            System.out.println("I'm in finally");
        }*/

        /*try {
            int i = 1 / 0;

        } finally {
            System.out.println("I'm in finally");
        }*/

        try {
            throw new Exception();
        } finally {
            throw new Error();
        }
    }
}














