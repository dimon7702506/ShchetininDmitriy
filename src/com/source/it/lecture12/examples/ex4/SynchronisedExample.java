package com.source.it.lecture12.examples.ex4;

public class SynchronisedExample {
    //public static Object lock = new Object();

    public static void main(String[] args) {
        //Worker worker = new Worker();
        for (int i = 0; i < 5; i++) {
            new Thread(new MyRunnable("Some msg " + i/*, worker*/)).start();
        }
    }

}

class MyRunnable implements Runnable {
    private String msg;
    //private Worker worker;

    public MyRunnable(String msg/*, Worker worker*/) {
        this.msg = msg;
        //this.worker = worker;
    }

    @Override
    public void run() {
        try {
            Worker.doWork(msg);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Worker {
    public static synchronized void doWork(String msg) throws InterruptedException {
        /*synchronized (SynchronisedExample.lock) {*/
            System.out.println("Before sleep " + msg);
            Thread.sleep(1000);
            System.out.println("After sleep " + msg);
        /*}*/
    }
}
