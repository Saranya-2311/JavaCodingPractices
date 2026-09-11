package javaPractise;
@FunctionalInterface
public interface TransactionValidator {
    boolean validateTransaction(double amount);
}
