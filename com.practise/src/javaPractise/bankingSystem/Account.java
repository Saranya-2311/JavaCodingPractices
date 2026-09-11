package javaPractise.bankingSystem;

public abstract class Account {
    private long accNum;
    private double accBalance;

    public Account(long accNum, double accBalance) {
        this.accNum = accNum;
        this.accBalance = accBalance;
    }

    public long getAccNum() {
        return accNum;
    }

    public void setAccNum(long accNum) {
        this.accNum = accNum;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }
    //Abstract methods to be implemented in other subclasses
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public void displayBalance() {
        System.out.println("Account No: " + accNum + ", Acc Balance: ₹" + accBalance);
    }
}
