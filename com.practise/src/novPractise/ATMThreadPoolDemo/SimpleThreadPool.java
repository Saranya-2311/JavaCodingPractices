package novPractise.ATMThreadPoolDemo;

import java.util.LinkedList;
import java.util.List;

public class SimpleThreadPool {

    private LinkedList<Runnable> taskQueue = new LinkedList<>();
    private List<Thread> workers = new LinkedList<>();
    private boolean isShutdown = false;

    public SimpleThreadPool(int numOfThread){
        if(numOfThread <= 0) throw new IllegalArgumentException("thread count should be greater 0");
        for(int i = 0;i< numOfThread;i++){
            Thread worker = new Thread(new Worker(), "Worker" + i);
            workers.add(worker);
            worker.start();
        }
    }
    public void submit(Runnable task) {
        if (task == null) throw new NullPointerException("task is null");

        synchronized (taskQueue) {
            if (isShutdown) {
                throw new IllegalStateException("ThreadPool is shutdown");
            }

            taskQueue.addLast(task);

            taskQueue.notify();   // ✅ NOW YOU OWN THE LOCK – SAFE
        }
    }
    public void shutdown() {
        synchronized (taskQueue) {
            isShutdown = true;
            taskQueue.notifyAll(); // wake all workers so they can exit if queue empty
        }
    }
    public void awaitTermination(){
        for (Thread t : workers) {
            try {
                t.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private class Worker implements Runnable{

        @Override
        public void run() {
            while (true) {
                Runnable task;
                synchronized (taskQueue) {
                    while (taskQueue.isEmpty() && !isShutdown) {
                        try {
                            taskQueue.wait();
                        } catch (InterruptedException ignored) {
                            // Re-check conditions on interrupt
                        }
                    }
                    if (taskQueue.isEmpty() && isShutdown) {
                        break; // no more work and pool is shutting down
                    }
                    task = taskQueue.removeFirst();
                }
                try {
                    task.run();
                } catch (Throwable t) {
                    System.err.println(Thread.currentThread().getName() + " encountered error: " + t.getMessage());
                }
            }
            System.out.println(Thread.currentThread().getName() + " exiting.");
        }
    }
}


