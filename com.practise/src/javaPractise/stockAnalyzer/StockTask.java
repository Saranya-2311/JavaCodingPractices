package javaPractise.stockAnalyzer;

import java.util.Random;
import java.util.concurrent.Callable;

public class StockTask implements Callable<Double> {

    private String stockTicker;
    StockTask(String stockTicker){
        this.stockTicker = stockTicker;
    }

    @Override
    public Double call() throws Exception {
        System.out.println("[Thread "+Thread.currentThread().getName()+" ]" +"is fetching the price for "+ stockTicker);
        Thread.sleep(1000);
        Double price = 100+(140* new Random().nextDouble());
        System.out.println("[Thread "+Thread.currentThread().getName()+" ]" +"found the price of "+ stockTicker +" and the price is $"+price);
        return price;
    }
}
