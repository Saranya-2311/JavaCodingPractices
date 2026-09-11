package javaPractise.bankingSystem;

public class CurrentAccount extends Account{
    private double overdraftLimit = 5000;

    public CurrentAccount(long accNum, double accBalance) {
        super(accNum, accBalance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            setAccBalance(getAccBalance() + amount);
            System.out.println("Deposited ₹" + amount + " into Current Account");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (getAccBalance() + overdraftLimit >= amount) {
            setAccBalance(getAccBalance() - amount);
            System.out.println("Withdrew ₹" + amount + " using overdraft facility");
        } else {
            System.out.println("Exceeds overdraft limit!");
        }
    }
}
