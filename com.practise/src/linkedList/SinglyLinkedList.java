package linkedList;

class Node{
    int data;
    Node next;
    //Constructor
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class SinglyLinkedList {
    public static Node head;
    // addNode
    public static void addNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        } else
        {
         Node current = head;
         while(current.next != null){
             current = current.next;
         }
         current.next = newNode;
        }
    }
    public static void traverseLinkList(Node head){
        Node current = head;
        while(current !=null){
            System.out.println("Node : "+current.data);
            current = current.next;
        }
    }
    public static boolean isElementExist(Node head,int element){
        Node current = head;
        while(current !=null){
            if (current.data == element){
                System.out.println("Node : "+current.data);
                return true;
            }
            current = current.next;
        }
        return false;

    }
    public static int findLength(Node head){
        if(head == null){
            return 0;
        }
         return 1 + findLength(head.next);
    }
    public static void insertAt(int data, int position) {
        Node newNode = new Node(data);
        if (position == 1) {
            newNode.next = head; // Point newNode's next to the current head
            head = newNode;
            return;
        }
            int currentPosition =1;
            Node current = head;
            while(current !=null  && currentPosition < position - 1){
                current.next = current;
                currentPosition++;
                }
        if (current == null) {
            System.out.println("Invalid position!");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }
    public static void main(String[] args){

        addNode(5);
        addNode(6);
        addNode(8);
        traverseLinkList(head);
        boolean isElementExist= isElementExist(head,0);
        System.out.println("isElementExist : "+isElementExist);
        int length = findLength(head);
        System.out.println("length : "+length);
        System.out.println("\nInserting 7 at position 2:");
        insertAt(7, 2);
        traverseLinkList(head);

        System.out.println("\nInserting 10 at position 1:");
        insertAt(10, 1);
        traverseLinkList(head);

        System.out.println("\nInserting 15 at position 10 (invalid):");
        insertAt(15, 10);

    }


}

