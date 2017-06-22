package com.source.it.lecture12.examples.ex5;

public class WaitNotifyNotifyAllExample {
    public static void main(String[] args) throws InterruptedException {
        Object object = new Object();

        synchronized (object) {
            object.wait();
            Thread.sleep(1000);
            //object.notify();
            //object.notifyAll();
        }
    }
}
