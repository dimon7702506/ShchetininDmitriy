package com.source.it.lecture8.examples.generic;

public class GenericHolderExample {
    public static void main(String[] args) {
        GenericHolder<String> holder = new GenericHolder<>();

        holder.setValue("12333x");

        System.out.println(holder.getValue());

        GenericHolder<Exception> exceptionGenericHolder =
                new GenericHolder<>();

        exceptionGenericHolder.setValue(new Exception("Some reason"));
        exceptionGenericHolder.setValue(new RuntimeException());
        exceptionGenericHolder.setValue(new NullPointerException());
        exceptionGenericHolder.setValue((Exception)new Throwable());

    }
}
