package javaPractise;


public  class TransactionValidatorImpl {
    public static void main(String[] args){
        TransactionValidator validator = (amount)-> amount > 0 && amount < 100000;
        System.out.println(validator.validateTransaction(1000));

    }


}
