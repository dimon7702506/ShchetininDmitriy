package com.source.it.lecture7.examples.exceptions;

public class ExtendedClass extends SomeExceptionClass {
    @Override
    public void method() throws RuntimeException {
        throw new RuntimeException();
    }
}
