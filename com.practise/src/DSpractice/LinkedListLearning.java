package DSpractice;

public class LinkedListLearning {
    public static void main(String[] args){
    LListNode1 head = new LListNode1(5);
        head.next = new LListNode1(2);
        head.next.next = new LListNode1(2);
        LListNode1 curr = head;
while(curr!=null){
    System.out.println(curr.value);
    curr = curr.next;
    System.out.println();
}

    }
}
