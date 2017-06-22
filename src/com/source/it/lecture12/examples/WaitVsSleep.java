package com.source.it.lecture12.examples;

public class WaitVsSleep {
    private static Object lock = new Object();

    public static void main(String[] args) {
        new Thread(new MyRunnable(lock)).start();
        new Thread(new MyRunnable(lock)).start();

    }
}

class MyRunnable implements Runnable {
    private Object lock;

    public MyRunnable(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        System.out.println("Starting work in thread "
                + Thread.currentThread().getName());
        while(true) {
            synchronized (lock) {
                System.out.println("Waked up in "
                        + Thread.currentThread().getName());
                lock.notify();

                try {
                    lock.wait();
                } catch (InterruptedException e) {}
            }
        }
    }
}
