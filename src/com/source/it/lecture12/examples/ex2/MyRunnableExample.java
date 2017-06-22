package com.source.it.lecture12.examples.ex2;

public class MyRunnableExample {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println(runnable.isDone());
        thread.join();
        System.out.println(runnable.isDone());
        System.out.println("Everything is done");
    }
}

class MyRunnable implements Runnable {
    private boolean done;

    public boolean isDone() {
        return done;
    }

    @Override
    public void run() {
        double b = 0;
        for (int i = 0; i < 2_000_000; i++) {
            b += Math.pow(Math.sin(i) + Math.cos(i), 2) * Math.tan(i);
        }
        System.out.println("Done in thread "
                + Thread.currentThread().getName()
                + " b = " + b);
        done = true;
    }
}
