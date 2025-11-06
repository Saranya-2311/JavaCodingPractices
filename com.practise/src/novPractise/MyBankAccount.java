package novPractise;

public class MyBankAccount {

    private long accNumber;
    private long accBalance;

    public long getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(long accNumber) {
        this.accNumber = accNumber;
    }
    MyBankAccount(long accNumber, long accBalance){
        this.setAccNumber(accNumber);
        this.setAccBalance(accBalance);
    }
    public long getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(long accBalance) {
        this.accBalance = accBalance;
    }

    public long deposit(long amt) {
        if (amt > 0 && this.getAccBalance() >= amt) {
            setAccBalance(this.getAccBalance() + amt);
        } else {
            return -1;
        }
        return this.getAccBalance();
    }

    public long withDraw(long amt) {
        if (this.getAccBalance() > amt) {
            setAccBalance(this.getAccBalance() - amt);
        } else {
            return -1;
        }
        return this.getAccBalance();
    }
}
