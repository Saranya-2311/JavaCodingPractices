package javaPractise.eCommerceWareHouse;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class WareHouse {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        ExecutorService executor = Executors.newFixedThreadPool(10);

        try {
            for (int i = 0; i < 10; i++) {
                executor.submit(new RobortWorker(inventory));
            }
        } finally{
            executor.shutdown();
            try {
                executor.awaitTermination(40, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Stock Count: "+inventory.getStockCount());
    }
}
