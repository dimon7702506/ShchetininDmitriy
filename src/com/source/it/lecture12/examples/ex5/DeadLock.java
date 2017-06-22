package com.source.it.lecture12.examples.ex5;

public class DeadLock {
    private static Object lock1 = new Object();
    private static Object lock2 = new Object();

    public static void main(String[] args) {
        new Thread(new MyRunnable(lock1, lock2)).start();
        new Thread(new MyRunnable(lock2, lock1)).start();
    }
}

class MyRunnable implements Runnable {
    private Object lock1;
    private Object lock2;

    public MyRunnable(Object lock1, Object lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    @Override
    public void run() {
        synchronized (lock1) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
            synchronized (lock2) {
                System.out.println("Doing work");
            }
        }

    }
}
