package DSpractice;

public class ReversalinKGroups {
    public static void main(String[] args) {

        LListNode1 head = new LListNode1(5);
        head.next = new LListNode1(2);
        head.next.next = new LListNode1(6);
        head.next.next.next = new LListNode1(3);
        head.next.next.next.next= new LListNode1(8);
        head.next.next.next.next.next = new LListNode1(9);
        head.next.next.next.next.next.next= new LListNode1(11);
        head.next.next.next.next.next.next.next = new LListNode1(6);
        int k =3;
        Reversal reversal = new Reversal();
        LListNode1 dummyNode = reversal.reversalKgroups(head,k);
        LListNode1 printNode = dummyNode;
        while(printNode != null){
            System.out.print(printNode.value + " -> ");
            printNode = printNode.next;
        }
        System.out.println("null");
    }
    }
 class Reversal {
        public LListNode1 reversalKgroups(LListNode1 head, int k ) {
            LListNode1 dummyNode = new LListNode1(0);
            dummyNode.next = head;
            LListNode1 prev = dummyNode;


            while(true){
                LListNode1 scout = prev;
                for(int i=0;i<k;i++){
                    scout = scout.next;
                    if(scout==null){
                        return dummyNode.next;
                    }

                }
                LListNode1 curr = prev.next;

                for(int i=1;i<k;i++) {
                    LListNode1 temp = curr.next;
                    curr.next = temp.next;
                    temp.next = prev.next;
                    prev.next = temp;

                }
                prev = curr;
            }

        }
    }

