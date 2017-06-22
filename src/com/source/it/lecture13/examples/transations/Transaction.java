package com.source.it.lecture13.examples.transations;

public class Transaction {
    private Account from;
    private Account to;
    private long amount;

    public Transaction(Account from, Account to, long amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
        //System.out.println("Transaction created " + this);
    }

    public boolean perform() {
        if (from == null || to == null || from.equals(to)) {
            return false;
        }

        Account first;
        Account second;
        if (from.getId() < to.getId()) {
            first = from;
            second = to;
        } else {
            first = to;
            second = from;
        }
        synchronized (first) {
            synchronized (second) {
                if (amount <= 0 || from.getAmount() < amount) {
                    //System.out.println("Insufficient funds!!");
                    return false;
                }
                from.setAmount(from.getAmount() - amount);
                to.setAmount(to.getAmount() + amount);
            }
        }
        //System.out.println("Transaction performed " + this);
        return true;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "from=" + from +
                ", to=" + to +
                ", amount=" + amount +
                '}';
    }
}
