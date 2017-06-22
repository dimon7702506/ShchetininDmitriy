package com.source.it.lecture13.examples.interruptexamples;

public class InterruptExapmple {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyRunnable());

        thread.start();
        Thread.sleep(1000);
        thread.interrupt();
        System.out.println("Existing application");
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Starting thread execution " + Thread.currentThread().getName());
        long startTime = System.currentTimeMillis();
        double d;
        for (long k = 1; k < 5_000_000; k++) {
            d = (Math.sin(k) + Math.cos(k)) / Math.tan(k);
            d++;
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Finishing thread execution " + Thread.currentThread().getName() + " . Elapsed " +
                (endTime - startTime) + " ms.");
    }
}
