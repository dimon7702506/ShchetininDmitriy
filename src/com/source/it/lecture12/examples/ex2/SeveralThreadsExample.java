package com.source.it.lecture12.examples.ex2;

public class SeveralThreadsExample {
    public static void main(String[] args) throws InterruptedException {
        ParallelThread thread1 = new ParallelThread();
        ParallelThread thread2 = new ParallelThread();
        thread1.start();
        thread2.start();
        //Thread.sleep(5000);
        System.out.println(thread1.isDone());
        System.out.println(thread2.isDone());
        thread1.join();
        thread2.join();
        System.out.println(thread1.isDone());
        System.out.println(thread2.isDone());
        System.out.println("Done in main");
    }
}

class ParallelThread extends Thread {
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
                + this.getName()
                + " b = " + b);
        done = true;
    }
}
