package javaPractise;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorFutureDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<Integer> future = executor.submit(() -> {
            Thread.sleep(6000);
            return 42;
        });

        System.out.println("Doing other work...");

        System.out.println(future.get()); // waits until result is ready, prints 42
        executor.shutdown();
    }
}
