package feb26;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

    public static void main(String[] args){
        System.out.println("=== CONCURRENT EXECUTION ===");

        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 1; i <= 10; i++) {
            NumberTask task = new NumberTask(i);
            executor.submit(task);
        }
        executor.shutdown();
    }
}
