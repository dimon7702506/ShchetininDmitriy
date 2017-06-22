package com.source.it.lecture13.examples.racecondition;

public class RaceConditionExample {
    static /*volatile*/ int count = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnable());
        thread1.start();
        Thread thread2 = new Thread(new MyRunnable());
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("Count = " + count);
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1_000_000; i++) {
            double x = (Math.sin(i) + Math.cos(i) * Math.sin(i)) + Math.tan(i);;
            /*synchronized (RaceConditionExample.class) {*/
                RaceConditionExample.count++;
            /*}*/
        }
    }
}
