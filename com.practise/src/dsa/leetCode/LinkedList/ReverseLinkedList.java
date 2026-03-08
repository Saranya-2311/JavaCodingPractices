package dsa.leetCode.LinkedList;



public class ReverseLinkedList {
    public static void main(String[] args){
        LListNode head = new LListNode(1);
        head.next = new LListNode(7);
        head.next.next = new LListNode(8);
        head.next.next.next = new LListNode(5);
        LListNode prev  = null;
        LListNode curr = head;
        while(curr !=null){
        LListNode nextNode = curr.next;
        curr.next = prev;
        prev = curr;
        curr = nextNode;
        }
        LListNode printNode = prev;
        while(printNode != null){
            System.out.print(printNode.value + " -> ");
            printNode = printNode.next;
        }
        System.out.println("null");
    }
}


