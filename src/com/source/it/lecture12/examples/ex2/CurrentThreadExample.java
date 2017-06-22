package com.source.it.lecture12.examples.ex2;

import com.source.it.lecture2.examples.oop.User;

public class CurrentThreadExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = Thread.currentThread();
        System.out.println("Thread name = " + thread.getName());
        Thread.sleep(1000);
        System.out.println("Slept for 3000 ms");
        //method("gs", "adfg");
    }

    public static void method(String...args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
