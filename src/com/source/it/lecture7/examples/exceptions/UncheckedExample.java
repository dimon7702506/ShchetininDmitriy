package com.source.it.lecture7.examples.exceptions;

public class UncheckedExample {
    public static void main(String[] args) {
        AnotherSomeClass cl = new AnotherSomeClass();
        cl.method();

    }
}

class AnotherSomeClass {
    void method() throws RuntimeException{
        throw new RuntimeException();
    }
}
