package com.source.it.lecture7.examples;

public class GarbageCollectorExample {
    public static void main(String[] args) throws InterruptedException {
        ClassWithFinalize c = new ClassWithFinalize();
        c = new ClassWithFinalize();
        c = null;
        System.gc();
        Thread.sleep(1000);
    }
}

class ClassWithFinalize {

    @Override
    protected void finalize() {
        System.out.println("Finalazing");
    }
}