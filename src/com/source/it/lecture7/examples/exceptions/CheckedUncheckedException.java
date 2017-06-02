package com.source.it.lecture7.examples.exceptions;

public class CheckedUncheckedException {
    public static void main(String[] args) {
        SomeClass sc = new SomeClass();
        try {
            sc.method();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class SomeClass {
    void method() throws Exception {
        throw new Exception();
    }
}
