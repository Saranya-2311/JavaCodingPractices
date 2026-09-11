package javaPractise.tradingSystem;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private final String accNumber;
    private double balance;

    ReentrantLock rLock = new ReentrantLock();

    public Account(String accNumber, double balance) {
        this.accNumber = accNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        rLock.lock();
        try {
            balance = balance + amount;
            System.out.println(Thread.currentThread().getName() + " deposited " + amount);
        } finally {
            rLock.unlock();
        }
    }

    public boolean withdraw(double amount) {
        try {
            if (rLock.tryLock(1, TimeUnit.SECONDS)) {
                try {
                    if (balance >= amount) {
                        balance = balance - amount;
                        return true;
                    }
                    return false;
                } finally {
                    rLock.unlock();

                }

            }

        } catch (InterruptedException exception) {
            System.err.println(exception.getMessage());
        }
        return false;

    }

    public double getBalance() {
        return balance;
    }
}




