package com.source.it.lecture13.examples.synchronised;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        SynchronizedExample ex = new SynchronizedExample();
        SynchronizedExample ex1 = new SynchronizedExample();
        new Thread(new MyRunnable(ex)).start();
        new Thread(new MyRunnable(ex1)).start();
    }
}

class MyRunnable implements Runnable {
    SynchronizedExample ex;
    public MyRunnable(SynchronizedExample ex) {
        this.ex = ex;
    }

    @Override
    public void run() {
        try {
            ex.method("Hello");
        } catch (InterruptedException e) {}
    }
}
