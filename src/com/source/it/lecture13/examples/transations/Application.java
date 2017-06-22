package com.source.it.lecture13.examples.transations;

import java.util.*;

public class Application {
    private static final int PRODUCER_QUANTITY = 50;
    private static final int CONSUMER_QUANTITY = 3;

    public static void main(String[] args) throws InterruptedException {
        List<Account> accounts = createAccounts(25);
        new Thread(new AccountObserver(accounts)).start();

        Thread.sleep(100);
        Deque<Transaction> transactions = new LinkedList<>();

        for (int i = 0; i < PRODUCER_QUANTITY; i++) {
            new Thread(new Producer(accounts, transactions)).start();
        }

        for (int i = 0; i < CONSUMER_QUANTITY; i++) {
            new Thread(new Consumer(transactions)).start();
        }

    }

    public static List<Account> createAccounts(int quantity) {
        Random random = new Random();
        List<Account> accounts = new ArrayList<>();
        for (int index = 0; index < quantity; index++) {
            Account account = new Account(index, random.nextInt(100000) + 1000);
            accounts.add(account);
        }
        return accounts;
    }
}
