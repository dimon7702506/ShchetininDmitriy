package com.source.it.lecture13.examples.interruptexamples;

public class InterruptedExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new InterruptedRunnable());

        thread.start();
        Thread.sleep(1000);
        thread.interrupt();
        System.out.println("Existing application");
    }
}

class InterruptedRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Starting thread execution " + Thread.currentThread().getName());
        long startTime = System.currentTimeMillis();
        while (!Thread.interrupted()) {
            double d;
            for (long k = 1; k < 1_000; k++) {
                d = (Math.sin(k) + Math.cos(k)) / Math.tan(k);
                d++;
            }
            System.out.println(Thread.interrupted());
        }
        long endTime = System.currentTimeMillis();
        System.out.println(Thread.interrupted());
        System.out.println("Finishing thread execution " + Thread.currentThread().getName() + " . Elapsed " +
                (endTime - startTime) + " ms.");
    }
}
