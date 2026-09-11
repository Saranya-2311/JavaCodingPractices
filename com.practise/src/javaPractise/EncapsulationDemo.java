package javaPractise;

public class EncapsulationDemo {
    public static void main(String[] args){

        long result;
        MyBankAccount myBankAccountObj = new MyBankAccount(354366457,3435436);
        result = myBankAccountObj.deposit(1400);
        if (result> -1 ){
            System.out.println("Balance : "+myBankAccountObj.getAccBalance());
        } else{
            System.out.println("amount is incorrect/invalid");
        }

        result = myBankAccountObj.withDraw(-1);
        if (result> -1 ){
            System.out.println("Balance : "+myBankAccountObj.getAccBalance());
        } else{
            System.out.println("insufficient balance");
        }

    }

}

