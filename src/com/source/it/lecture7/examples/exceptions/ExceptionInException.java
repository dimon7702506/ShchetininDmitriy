package com.source.it.lecture7.examples.exceptions;

public class ExceptionInException {
    public static void main(String[] args) {
        ExceptionClass ec = new ExceptionClass();
        try {
            ec.method();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException("there was an exception", e);
        }
    }
}

class ExceptionClass {
    void method() throws Exception {
        throw new Exception("Some description");
    }
}
