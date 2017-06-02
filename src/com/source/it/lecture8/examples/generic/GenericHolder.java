package com.source.it.lecture8.examples.generic;

public class GenericHolder<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
