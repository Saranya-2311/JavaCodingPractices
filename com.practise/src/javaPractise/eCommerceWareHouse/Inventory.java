package javaPractise.eCommerceWareHouse;

/**
 * Shared class to store the inventory - Global stock details
 */
public class Inventory {

    private int stockCount =0;

    public synchronized void addItem(){
        int current =stockCount;
        try {
            System.out.println("Hey!! "+ Thread.currentThread().getName()+" here !!");
            Thread.sleep(1);
            stockCount = current+1;
            System.out.println("Hey!! "+ Thread.currentThread().getName()+" exiting !!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public synchronized int getStockCount(){
        return stockCount;
    }
}
