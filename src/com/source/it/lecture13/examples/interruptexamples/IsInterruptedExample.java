package com.source.it.lecture13.examples.interruptexamples;

public class IsInterruptedExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new IsInterruptedRunnable());

        thread.start();
        Thread.sleep(2000);
        thread.interrupt();
        System.out.println("Existing application");
    }
}

class IsInterruptedRunnable implements Runnable {

    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        System.out.println("Starting thread execution " + thread.getName());
        long startTime = System.currentTimeMillis();
        while (!thread.isInterrupted()) {
            double d;
            for (long k = 1; k < 1_000_000; k++) {
                d = (Math.sin(k) + Math.cos(k)) / Math.tan(k);
                d++;
            }
            System.out.println(thread.isInterrupted());
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Finishing thread execution " + thread.getName() + " . Elapsed " +
                (endTime - startTime) + " ms.");
    }
}

