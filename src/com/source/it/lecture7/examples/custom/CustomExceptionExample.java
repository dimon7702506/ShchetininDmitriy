package com.source.it.lecture7.examples.custom;

public class CustomExceptionExample {
    public static void main(String[] args) throws CustomException {
        try {
            throw new CustomException("Message", new Error("Error"));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            Throwable cause = e.getCause();
            System.out.println(cause.getMessage());
        }
    }
}
