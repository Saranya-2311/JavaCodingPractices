package dsa.leetCode.LinkedList;

public class CycleDetection {
    public static void main(String[] args){
        LListNode head = new LListNode(1);
        head.next = new LListNode(7);
        head.next.next = new LListNode(8);
        head.next.next.next = new LListNode(5);
       head.next.next.next.next = head.next.next;

        LListNode slow = head;
        LListNode fast = head;
        boolean cycle = false;
        while(fast!=null && fast.next!=null){

            slow = slow.next;
            fast = fast.next.next;
            if(slow.equals(fast)){
                cycle = true;
                break;
            }
        }
        LListNode cycleStart =null;
        if(cycle == true){
            fast = head;
            while(!slow.equals(fast)){
                slow = slow.next;
                fast=fast.next;
            }
            cycleStart = slow;
        }

        System.out.println("Cycle = "+cycle);
        System.out.println("Cycle Start node value = "+(cycleStart !=null? cycleStart.value : "No cycle detected"));
    }
}
