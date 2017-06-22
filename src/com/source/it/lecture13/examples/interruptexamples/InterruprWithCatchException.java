package com.source.it.lecture13.examples.interruptexamples;

public class InterruprWithCatchException {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new CaughtInterruptedExceptionRunnable());

        thread.start();
        Thread.sleep(3000);
        thread.interrupt();
        System.out.println("Existing application");
    }
}

class CaughtInterruptedExceptionRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Starting thread execution " + Thread.currentThread().getName());
        long startTime = System.currentTimeMillis();
        try {
            while (true) {
                synchronized (this) {
                    this.wait();
                }
                //Thread.sleep(5000);
                System.out.println("Still working");
            }
        } catch (InterruptedException ie) {
            System.out.println("This thread was interrupted");
        }
        long endTime = System.currentTimeMillis();
        System.out.println(Thread.currentThread().isInterrupted());
        System.out.println(Thread.interrupted());
        System.out.println("Finishing thread execution " + Thread.currentThread().getName() + " . Elapsed " +
                (endTime - startTime) + " ms.");
    }
}
