package feb26;

public class NumberTask implements Runnable{
    private  int number;
    NumberTask(int number){
        this.number = number;
    }
    @Override
    public void run() {
        try {
            System.out.println("Printing Number "+ number+" by "+Thread.currentThread().getName());
            long startTime = System.currentTimeMillis();
            System.out.println("startTime"+startTime);
            Thread.sleep(1000);
            System.out.println("done");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
