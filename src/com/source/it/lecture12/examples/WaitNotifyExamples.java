package com.source.it.lecture12.examples;

import java.util.Arrays;
import java.util.List;

public class WaitNotifyExamples {
    public static Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        SlaveRunnable slave1 = new SlaveRunnable();
        SlaveRunnable slave2 = new SlaveRunnable();
        Thread thread = new Thread(slave1);
        Thread anotherThread = new Thread(slave2);
        Thread masterThread = new Thread(new MasterRunnable(Arrays.asList(slave1, slave2)));
        thread.start();
        anotherThread.start();
        masterThread.start();
        System.out.println("Exiting app");
    }

}

class SlaveRunnable implements Runnable {
    private boolean finished;

    public void run() {
        synchronized (WaitNotifyExamples.lock) {
            System.out.println("Entering the thread"
                    + Thread.currentThread().getName());
            sleepAndIgnoreException();
            System.out.println("I'm done" + Thread.currentThread().getName());
            finished = true;
        }
    }

    public boolean isFinished() {
        return finished;
    }

    private void sleepAndIgnoreException() {
        try {
            WaitNotifyExamples.lock.wait();
            Thread.sleep(1000);
        } catch (InterruptedException e) {/*NOP*/}
    }
}

class MasterRunnable implements Runnable {
    private List<SlaveRunnable> slaves;

    public MasterRunnable(List<SlaveRunnable> slaves) {
        this.slaves = slaves;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (WaitNotifyExamples.lock) {
                WaitNotifyExamples.lock.notify();
            }
            try {
                Thread.sleep(200);
                boolean finished = true;
                for (SlaveRunnable slave : slaves) {
                    if (!slave.isFinished()) {
                        System.out.println("Slave is not finished!!");
                        finished = false;
                    }
                }
                if (finished) {
                    break; //while
                }
            } catch (InterruptedException e) {/*NOP*/}
        }
    }
}
