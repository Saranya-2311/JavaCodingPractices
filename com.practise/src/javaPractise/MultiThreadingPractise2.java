package javaPractise;

class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Running Thread!! Thread Name :: " +Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class MultiThreadingPractise2 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            MyRunnable runnableObj = new MyRunnable();
            Thread th = new Thread(runnableObj);
            th.start();
        }
    }
}
