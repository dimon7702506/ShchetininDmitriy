package com.source.it.lecture13.examples.synchronised;

public class SynchronizedExample {

    public synchronized static void staticMethod(String str) throws InterruptedException {
        System.out.println(str);
        Thread.sleep(1000);
        System.out.println(str);
    }
    public synchronized void method(String str) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(3000);
        System.out.println(Thread.currentThread().getName());
    }

    public void method1(String str) {
        synchronized (this) {
            System.out.println(str);
        }
    }
}
