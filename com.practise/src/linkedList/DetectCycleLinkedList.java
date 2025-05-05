package linkedList;

import linkedList.SinglyLinkedList.*;

//floyds cycle detection algo
public class DetectCycleLinkedList {
    Node head = null;
    public static void main(String[] args) {

    }

    public static boolean hasCycle(Node head) {
        boolean hasCycle = false;
        if(head == null || head.next == null){
            return hasCycle;
        }
        Node slow = head;
        Node fast = head.next;
        while (fast!=null && fast.next != null ) {
            if ( slow==fast) {
                hasCycle = true;
                return hasCycle;
            }
                slow = slow.next;
                fast = fast.next.next;
        }
        return hasCycle;
    }
}


