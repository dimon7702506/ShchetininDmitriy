package com.source.it.lecture13.examples.threadlocalexample;

public class ThreadLocalExample {
    private static ThreadLocal<Integer> count = new ThreadLocal<>();

    public static void main(String[] args) throws InterruptedException {
        ThreadLocalExample me = new ThreadLocalExample();
        me.doWork();
        me.doWork();
        me.doWork();
        while (true) {
            System.out.println("Count = " + count.get());
            Thread.sleep(300);
        }
    }

    public void doWork() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                count.set(0);
                while (true) {
                    int i = count.get();
                    i++;
                    count.set(i);
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {}
                    System.out.println("Thread is " + Thread.currentThread().getName() +
                            " Count = " + count.get());
                }
            }
        };
        new Thread(runnable).start();
    }
}

