package com.source.it.lecture13.examples;

public class VolatileExample {
    private static volatile int count = 0;

    public static void main(String[] args) {
        new ChangeListener().start();
        new ChangeWriter().start();
    }

    static class ChangeListener extends Thread {
        @Override
        public void run() {
            int local_value = count;
            while ( local_value < 5){
                if( local_value!= count){
                    System.out.println("Got Change for count " + count);
                    local_value = count;
                }
            }
        }
    }

    static class ChangeWriter extends Thread {
        @Override
        public void run() {

            int local_value = count;
            while (count < 5){
                System.out.println("Incrementing count to " + (local_value + 1));
                count = ++local_value;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {/*NOP*/}
            }
        }
    }
}