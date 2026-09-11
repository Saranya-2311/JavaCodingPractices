package javaPractise.bankingSystem;

public class SavingsAccount extends Account{
    private double interestRate = 0.03;
    public SavingsAccount(long accNum, double accBalance) {
        super(accNum, accBalance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            setAccBalance(getAccBalance()+amount+ (amount * interestRate));
            System.out.println("Deposited ₹" + amount + " with interest.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (getAccBalance() >= amount) {
            setAccBalance(getAccBalance() - amount);
            System.out.println("Withdrew ₹" + amount + " from Savings Account");
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}
