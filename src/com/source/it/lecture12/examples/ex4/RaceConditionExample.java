package com.source.it.lecture12.examples.ex4;

import com.source.it.lecture8.examples.generic.ObjectHolder;

public class RaceConditionExample {
    private static long value;
    private final static Object object = new Object();

    public static void main(String[] args) {
        new Thread(new MyPositiveRunnable()).start();
        new Thread(new MyNegativeRunnable()).start();

    }

    private static class MyPositiveRunnable implements Runnable {
        @Override
        public void run() {
            while (true) {
                long valueNow;
                synchronized (object) {
                    value = 1000;
                    valueNow = value;
                    System.out.println("Positive");
                }
                if (valueNow != 1000) {
                    System.out.println("Value = " + valueNow);
                }
            }
        }
    }

    private static class MyNegativeRunnable implements Runnable {
        @Override
        public void run() {
            while (true) {
                long valueNow;
                synchronized (object) {
                    value = -1000;
                    valueNow = value;
                    System.out.println("Negative");
                }
                if (valueNow != -1000) {
                    System.out.println("Value = " + valueNow);
                }
            }
        }
    }
}
