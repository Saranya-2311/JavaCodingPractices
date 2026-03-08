package novPractise.ATMThreadPoolDemo;

public class SystemDemo {

    public static void main(String[] args) throws InterruptedException {

        SimpleThreadPool pool = new SimpleThreadPool(3); // 3 ATM server workers

        pool.submit(() -> System.out.println("Transaction 1 processed"));
        pool.submit(() -> System.out.println("Transaction 2 processed"));
        pool.submit(() -> System.out.println("Transaction 3 processed"));
        pool.submit(() -> System.out.println("Transaction 4 processed"));

        Thread.sleep(2000);

        System.out.println("Shutting down ATM server...");
        pool.shutdown();
        pool.awaitTermination();

        System.out.println("ATM Server closed.");
    }
}
