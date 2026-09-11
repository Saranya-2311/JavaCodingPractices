package DSpractice;

public class MergeSortList {
    public static void main(String[] args){
        LListNode head1 = new LListNode(1);
        head1.next = new LListNode(3);
        head1.next.next = new LListNode(5);
        head1.next.next.next = new LListNode(6);

        LListNode head2 = new LListNode(2);
        head2.next = new LListNode(4);
        head2.next.next = new LListNode(6);
        head2.next.next.next = new LListNode(8);

        LListNode MergedListHead = mergeLists(head1,head2);
        LListNode printNode = MergedListHead;
        while(printNode != null){
            System.out.print(printNode.value + " -> ");
            printNode = printNode.next;
        }
        System.out.println("null");
    }


    private static LListNode mergeLists(LListNode head1, LListNode head2) {
        LListNode dummyNode = new LListNode(0);
        LListNode tail = dummyNode;
        while (head1!=null && head2!=null){
            if(head1.value <= head2.value){
                tail.next = head1;
                head1= head1.next;
            }else{
                tail.next = head2;
                head2= head2.next;
            }
            tail = tail.next;
        }
        if (head1 != null) {
            tail.next = head1;
        } else {
            tail.next = head2;
        }
        return dummyNode.next;
    }
}
