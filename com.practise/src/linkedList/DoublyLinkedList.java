package linkedList;

class DoubleNode{
    int key;
    DoubleNode prev,next;

    DoubleNode(int data){
        this.key = data;
        prev = next = null;
    }
}
public class DoublyLinkedList {
    static DoubleNode head=null;
    static DoubleNode tail = null;

    //printLinkedList
    public static void printList() {
        DoubleNode current = head; int i=0;
       while(current != null){
           System.out.println(i+"= "+current.key);
           current = current.next;
           i++;
       }
    }
    // addNodeToEnd
    public static void addNodeToEnd(int data){
        DoubleNode newNode = new DoubleNode(data);
        if(head ==null){
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
        }
        tail = newNode;
    }
    //   addNodeToFront
    public static void addNodeToFront(int data){
        DoubleNode newNode = new DoubleNode(data);
        if(head ==null){
            head = newNode;
            tail = newNode;
        } else {
           newNode.next = head;
           head.prev = newNode;
           head = newNode;
        }
    }
    //addNodeAtPosition
    public static void addNodeAtPosition(int data,int position){
        DoubleNode newNode = new DoubleNode(data);
        if (position == 1) { // Special case: insert at the head
            newNode.next = head;
            if (head != null) {
                head.prev = newNode;
            }
            head = newNode;
            if (tail == null) { // If the list was empty, tail also needs to point to the new node
                tail = newNode;
            }
            return;
        }
        DoubleNode current = head;
        int counter = 1;

        while (current != null && counter < position - 1) {
            current = current.next;
            counter++;
        }

        if (current == null) { // Position exceeds list length
            System.out.println("Position out of bounds!");
            return;
        }

        // Insert the new node at the correct position
        newNode.next = current.next;
        newNode.prev = current;

        if (current.next != null) {
            current.next.prev = newNode;
        } else { // If inserting at the end, update the tail
            tail = newNode;
        }
        current.next = newNode;
    }

public static void main(String[] args){

        addNodeToEnd(6);
        addNodeToEnd(8);
        addNodeToEnd(5);
        printList();
        addNodeToFront(7);
        printList();
}



    //DeleteAtFront
    //DeleteAtEnd
    //DeleteAtPosition
    //find
    //forwardTraverse
    //BackwardTraverse
    //findLength
    //ClearList - remove all nodes


}