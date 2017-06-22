package com.source.it.lecture13.examples.deprecatedmethods;

public class StopExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
        Thread.sleep(1000);
        thread.stop();
        System.out.println("Existing application");
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Starting thread execution " + Thread.currentThread().getName());
        long startTime = System.currentTimeMillis();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {/*NOP*/}
        long endTime = System.currentTimeMillis();
        System.out.println("Finishing thread execution " + Thread.currentThread().getName() +
                " . Elapsed " + (endTime - startTime) + " ms.");
    }
}
