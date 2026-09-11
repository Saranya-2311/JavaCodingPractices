package DSpractice;

public class IntersectionOfLists {
    public static void main(String[] args){

        LListNode common = new LListNode(4);
        common.next = new LListNode(5);
        //List A
        LListNode headA = new LListNode(1);
        headA.next = new LListNode(2);
        headA.next.next = common;
        headA.next.next.next = new LListNode(3);

        //List B
        LListNode headB = new LListNode(9);
        headB.next = common;
        headB.next.next = new LListNode(8);
        headB.next.next = new LListNode(5);
        headB.next.next.next = new LListNode(5);

        LListNode hA = headA;
        LListNode hB = headB;
       while(hA!=hB){
           hA = (hA==null)?headB:hA.next;
           hB = (hB==null)?headA:hB.next;
       }
        System.out.println("Intersecting node : "+hA.value);
    }
}
