package com.source.it.lecture12.examples;

public class JoinExample {
    public static void main(String[] args) throws InterruptedException {
        /*Thread thread = new Thread();
        thread.start();
        thread.join();*/

        Thread.currentThread().join();
    }
}
