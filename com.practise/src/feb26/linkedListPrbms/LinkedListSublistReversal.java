package feb26.linkedListPrbms;

public class LinkedListSublistReversal {
    public static void main(String[] args) {

        LListNode1 head = new LListNode1(5);
        head.next = new LListNode1(2);
        head.next.next = new LListNode1(3);
        head.next.next.next = new LListNode1(6);
        head.next.next.next.next = new LListNode1(8);
        head.next.next.next.next.next = new LListNode1(7);
        int m=2;
        int n=5;
        LListNode1 dummynode= new LListNode1(0);
        dummynode.next = head;
        LListNode1 prev = dummynode;
        for(int i=1; i<m;i++){
            prev = prev.next;
        }

        LListNode1 curr = prev.next;
        LListNode1 temp = curr.next;
        for(int i=m;i<n;i++){
            curr.next =temp.next;
            temp.next = prev.next;
            prev.next = temp;
            temp = curr.next;
        }
        LListNode1 printNode = dummynode.next;
        while(printNode != null){
            System.out.print(printNode.value + " -> ");
            printNode = printNode.next;
        }
        System.out.println("null");
    }

}
