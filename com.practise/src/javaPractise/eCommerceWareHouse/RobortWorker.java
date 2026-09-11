package javaPractise.eCommerceWareHouse;
// multiple robots working on inventory

public class RobortWorker implements Runnable{
    private final Inventory inventory;
    RobortWorker(Inventory inventory){
        this.inventory = inventory;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hey!! " + Thread.currentThread().getName() + " Robot , adding items !!");
            inventory.addItem();
            System.out.println("Hey!! " + Thread.currentThread().getName() + " Robot , out!!");
        }
    }
}
