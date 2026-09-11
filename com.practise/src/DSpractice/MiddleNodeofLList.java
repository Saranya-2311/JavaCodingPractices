package DSpractice;

public class MiddleNodeofLList {
    public static void main(String[] args){
        LListNode head = new LListNode(1);
        head.next = new LListNode(7);
        head.next.next = new LListNode(8);
        head.next.next.next = new LListNode(5);
        head.next.next.next.next = new LListNode(9);
        head.next.next.next.next.next = new LListNode(9);
        head.next.next.next.next.next.next= new LListNode(10);


        LListNode slow = head;
        LListNode fast = head;
        while (fast!=null && fast.next!=null){
            slow =slow.next;
            fast =fast.next.next;
        }

        System.out.println("Middle node :"+slow.value);
    }
}
