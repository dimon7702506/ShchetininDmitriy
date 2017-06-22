package com.source.it.lecture13.examples.transations;

import java.util.List;

public class AccountObserver implements Runnable {
    private List<Account> accounts;

    public AccountObserver(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public void run() {
        while(!Thread.currentThread().isInterrupted()) {
            long totalAmount = 0;
            for (Account account : accounts) {
                totalAmount += account.getAmount();
            }
            System.out.println("Total amount = " + totalAmount);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {/*NOP*/}
        }
    }
}
