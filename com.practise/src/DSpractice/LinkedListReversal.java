package DSpractice;


public class LinkedListReversal {

    public static void main(String[] args) {

        LListNode1 head = new LListNode1(5);
        head.next = new LListNode1(2);
        head.next.next = new LListNode1(3);
        LListNode1 curr = head;
        LListNode1 prev = null;
        LListNode1 nextNode = null;

        while(curr!=null){
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        while (prev != null) {
            System.out.println(prev.value);
            prev = prev.next;
            System.out.println();
        }
    }

}
