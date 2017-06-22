package com.source.it.lecture12.examples.ex2;

public class NewThreadExample {
    public static void main(String[] args) {
        Thread thread = new MyNewThread();
        //thread.run();
        thread.start();
        System.out.println("Exiting app");
    }
}

class MyNewThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread name " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {/*NOP*/}
        System.out.println("Hello World!");
    }
}
