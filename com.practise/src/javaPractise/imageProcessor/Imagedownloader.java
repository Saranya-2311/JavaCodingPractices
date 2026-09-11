package javaPractise.imageProcessor;

import java.util.Random;
import java.util.concurrent.Callable;

//Task
public class Imagedownloader implements Callable<Integer> {

    private String imageId;
    private Integer fileSize;
    Imagedownloader(String imageId){
        this.imageId = imageId;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println("Downloading Image " +imageId);
        fileSize = new Random().nextInt(2000)+500;
        Thread.sleep(fileSize);
        System.out.println("Downloaded image "+imageId+" of size "+fileSize);
        return fileSize;
    }
}
