package javaTryOuts;

public class Multithreading {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();  // Start the thread
    }
}
    class MyThread extends Thread {
        public void run() {
            System.out.println("Thread is running");
        }
}
