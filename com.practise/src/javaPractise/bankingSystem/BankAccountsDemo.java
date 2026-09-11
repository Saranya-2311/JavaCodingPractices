package javaPractise.bankingSystem;

import java.util.ArrayList;

public class BankAccountsDemo {
    public static void main(String[] args) {

      Account acc1 = new SavingsAccount(1001, 10000);
      Account acc2 = new CurrentAccount(2001, 20000);

        acc1.deposit(2000);
        acc1.withdraw(500);
        acc1.displayBalance();
    ArrayList<String> arr = new ArrayList<>();
        acc2.deposit(3000);
        acc2.withdraw(23000);
        acc2.displayBalance();
    }
}
//Concept	                    Example in Code
//Encapsulation	    private variables in Account with getters/setters
//Abstraction	    BankAccount defines abstract methods deposit() & withdraw()
//Inheritance   	SavingsAccount and CurrentAccount extend BankAccount
//Polymorphism  	BankAccount acc = new SavingsAccount(); — runtime method call