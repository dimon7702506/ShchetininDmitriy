package com.source.it.lecture12.examples.ex3;

public class RunnableExample {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        Thread thread = new Thread(new MyRunnable());
        Thread newThread = new Thread(new MyRunnable(), "My Thread name");
        Thread anonimousThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Entering the thread" + Thread.currentThread().getName());
                sleepAndIgnoreException(2000);
                System.out.println("I'm done" + Thread.currentThread().getName());
            }
        });
        thread.start();
        newThread.start();
        anonimousThread.start();
        System.out.println("Exiting app");

    }

    private static void sleepAndIgnoreException(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {/*NOP*/}
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Entering the thread " + Thread.currentThread().getName());
        sleepAndIgnoreException(2000);
        System.out.println("I'm done " + Thread.currentThread().getName());
    }

    private void sleepAndIgnoreException(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {/*NOP*/}
    }
}


