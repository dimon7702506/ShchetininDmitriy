package com.source.it.lecture12.examples.ex2;

public class MyThreadExample {
    public static void main(String[] args) {
        Thread thread = new NewThread();
        thread.start();
        System.out.println("Everything is done");
    }
}

class NewThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 4_000_000; i++) {
            double b = Math.sqrt(Math.sin(i) + Math.cos(i)) * Math.tan(i);
        }
        System.out.println("Thread is done it's work");
    }
}
