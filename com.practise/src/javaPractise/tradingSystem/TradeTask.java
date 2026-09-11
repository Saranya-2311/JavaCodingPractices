package javaPractise.tradingSystem;

import java.util.concurrent.CompletableFuture;

public class TradeTask implements Runnable {
    private Account source;
    private Account dest;
    private double amount;

    // 1. Constructor to pass the specific accounts for THIS trade
    public TradeTask(Account source, Account dest, double amount) {
        this.source = source;
        this.dest = dest;
        this.amount = amount;
    }

    @Override
    public void run() {
        processTrade(source, dest, amount);
    }

    public void processTrade(Account sourceAcc,Account destAcc, double amt){

        boolean isWithdrawSuccess = sourceAcc.withdraw(amt);
        if(isWithdrawSuccess){
            destAcc.deposit(amt);
            CompletableFuture.runAsync(() -> {
                // Imagine this takes time...
                System.out.println("[ASYNC] Generating Receipt for $" + amt);
            });

            System.out.println("Trade Engine: Move to next trade...");
            System.out.println("Trade completed");
        } else{
            System.out.println("Trade failed");
        }

    }
}
