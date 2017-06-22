package com.source.it.lecture13.examples.transations;

import java.util.Deque;

public class Consumer implements Runnable {
    private static int count = 0;
    private int number;
    private Deque<Transaction> transactionsQueue;

    public  Consumer(Deque<Transaction> transactions) {
        this.transactionsQueue = transactions;
        number = ++count;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Thread.sleep(75);
            } catch (InterruptedException e) {
                System.out.println("Consumer number " + number + " was interrupted");
                return;
            }

            Transaction transaction = null;
            synchronized (transactionsQueue) {
                transaction = transactionsQueue.pollFirst();
            }

            if (transaction == null) {
                //ToDo : I should wait!
                //System.out.println("No new transactionsQueue in list for consumer " + number);
            } else {
                if (!transaction.perform()) {
                    //System.out.println("Transaction was not performed " + transaction);
                }
            }
        }

        System.out.println("Finished work in consumer number " + number);
    }
}
