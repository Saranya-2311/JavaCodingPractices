package DSpractice;

public class RemoveNthNodeFromTheEnd {
    public static void main(String[] args){
        LListNode head = new LListNode(1);
        head.next = new LListNode(2);
        head.next.next = new LListNode(3);
        head.next.next.next = new LListNode(4);
        head.next.next.next.next = new LListNode(3);
        head.next.next.next.next.next = new LListNode(2);
        head.next.next.next.next.next.next= new LListNode(1);
        int n =3;
        LListNode dummyNode = new LListNode(0);
        dummyNode.next = head;
        LListNode right = dummyNode;
        LListNode left = dummyNode;
        for(int i =0;i<n && right!=null;i++){
            right = right.next;
        }
        while(right.next!=null)
        {
            right = right.next;
            left = left.next;
        }
        left.next = left.next.next;

        while(dummyNode.next!= null){

        System.out.println(dummyNode.next.value);
            dummyNode= dummyNode.next;

        }
    }


}
