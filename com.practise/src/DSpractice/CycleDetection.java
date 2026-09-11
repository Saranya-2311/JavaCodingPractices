package DSpractice;

public class CycleDetection {
    public static void main(String[] args){
        LListNode head = new LListNode(1);
        head.next = new LListNode(7);
        head.next.next = new LListNode(8);
        head.next.next.next = new LListNode(5);
       head.next.next.next.next = head.next.next;


       
    }
}
