package javaPractise;

class Mythread extends Thread {
    @Override
    public void run() {
        System.out.println("Running Thread!! Thread Name :: " + this.getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
public class MultiThreadingPractise {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Mythread mythrd = new Mythread();
            mythrd.start();
        }
    }
}
