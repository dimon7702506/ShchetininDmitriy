package com.source.it.lecture13.examples.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        /*Thread t = new Thread(new MyRunnable(), "Thread my own name");
        t.start();*/
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        MyRunnable myRunnable = new MyRunnable();
        executorService.submit(myRunnable);
        executorService.submit(new MyRunnable());
        executorService.submit(new MyRunnable());



        executorService.shutdownNow();
        while (!myRunnable.isReady()) {
        }

        System.out.println(myRunnable.getResult());
    }
}

class MyRunnable implements Runnable {
    private volatile int result = 0;
    private volatile boolean ready = false;

    public int getResult() {
        return result;
    }

    public boolean isReady() {
        return ready;
    }

    @Override
    public void run() {
        System.out.println("Started work at thread "
                + Thread.currentThread().getName());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {}
        System.out.println("Finished work at thread "
                + Thread.currentThread().getName());
        result = 1000;
        ready = true;
    }
}
