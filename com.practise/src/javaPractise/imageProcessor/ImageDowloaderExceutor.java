package javaPractise.imageProcessor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ImageDowloaderExceutor {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(6);
        List<CompletableFuture<Integer>> completableFutures = new ArrayList<>();
        List<String> images = Arrays.asList("img1", "img2", "img3");
        try {
            for (String image : images) {
                CompletableFuture<Integer> cf = CompletableFuture.supplyAsync(() -> {
                    try {
                        return new Imagedownloader(image).call();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }, executorService).thenApply(fileSize -> {
                    int filteredFilesize = fileSize + 200;
                    System.out.println("After applying filter size : " + image + "is " + filteredFilesize);
                    return filteredFilesize;
                });
                completableFutures.add(cf);
            }
            int totalDiskSpace = 0;
            for (CompletableFuture<Integer> cfutures : completableFutures) {
                totalDiskSpace += cfutures.join();
            }


            System.out.println("Total disk Space : " + totalDiskSpace);

        } finally {
            executorService.shutdown();
        }
    }
}

