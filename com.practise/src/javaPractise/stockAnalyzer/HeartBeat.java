package javaPractise.stockAnalyzer;

public class HeartBeat implements Runnable{
    private volatile boolean running = true;
    @Override
    public void run() {
        while(running){
            System.out.println("System is active and running");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
    public void stop(){
        running = false;
        System.out.println("Stopping");
    }
}
