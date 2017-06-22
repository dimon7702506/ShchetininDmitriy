package com.source.it.lecture12.examples.ex2;

public class ThreadExample {
    public static void main(String[] args) {
        System.err.println(Thread.currentThread().getName());

        Thread thread = new MyThread();
        Thread newThread = new MyThread();
        thread.start();
        newThread.start();
        System.err.println("Exiting app");

    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.err.println("Entering the thread " + this.getName());
        sleepAndIgnoreException(2000);
        System.err.println("I'm done " + Thread.currentThread().getName());
    }

    private void sleepAndIgnoreException(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {/*NOP*/}
    }
}
