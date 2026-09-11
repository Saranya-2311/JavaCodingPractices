package javaPractise.tradingSystem;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MarketManager {
    public static void main(String[] args)  {

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Account source = new Account("A",100);
        Account destination = new Account("B",50);

        executorService.submit(new TradeTask(source,destination,40));

        System.out.println(source.getBalance());

        executorService.shutdown();
    }
}
