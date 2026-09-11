package javaPractise.stockAnalyzer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class StockPortfolioAnalyzer {

    public static void main(String[] args)  {

        HeartBeat heartBeat = new HeartBeat();
        Thread thread = new Thread(heartBeat);
        thread.start();
        Double taxedtotalPortfolio =0.0;
        Double totalPortfolio = 0.0;
        List<String> stockList = Arrays.asList("AAPL", "GOOGL", "MSFT", "AMZN", "TSLA");
        ExecutorService executor = Executors.newFixedThreadPool(5);
        // CompletableFuture way
        List<CompletableFuture<Double>> completableFutures = new ArrayList<>();
        for(String stock : stockList) {
            CompletableFuture<Double> cf = CompletableFuture.supplyAsync(()-> {
                try {
                    return new StockTask(stock).call();
                    }catch (Exception e){
                        throw new RuntimeException(e);
                }


            },executor).thenApply(price-> {
                double taxedPrice = price* 1.05 ;
                System.out.println(">>> [Update] Taxed price for " + stock + ": $" + String.format("%.2f", taxedPrice));
                return taxedPrice;
            });
            completableFutures.add(cf);
        }
        for(CompletableFuture<Double> completableFuture : completableFutures){

            try {
                taxedtotalPortfolio += completableFuture.get();
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Total Portfolio with taxed price :"+taxedtotalPortfolio);



        // Future way
       List<Future<Double>>  futures = new ArrayList<>();
        try{
        for(String stock : stockList){
            futures.add(executor.submit(new StockTask(stock)));
        }
        for(Future<Double> future : futures){

                totalPortfolio += future.get();}
        heartBeat.stop();

            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }finally{
            executor.shutdown();
        }
        System.out.println("Your total portfolio : "+ totalPortfolio);
        }
    }

