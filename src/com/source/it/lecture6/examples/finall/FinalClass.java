package com.source.it.lecture6.examples.finall;

public class FinalClass {
    public final static int[] a = {1, 2};

    static {
        System.out.println("In static init section");
    }

    {
        System.out.println("Before constructor");
    }

    public FinalClass() {
        System.out.println("In constructor");
    }

    public final void doWork(final Object o) {
        //o = new Object();
        System.out.println("Doing work");
    }
}
