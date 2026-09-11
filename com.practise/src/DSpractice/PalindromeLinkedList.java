package DSpractice;

public class PalindromeLinkedList {
    public static void main(String[] args){
        LListNode head = new LListNode(1);
        head.next = new LListNode(2);
        head.next.next = new LListNode(3);
        head.next.next.next = new LListNode(4);
        head.next.next.next.next = new LListNode(3);
        head.next.next.next.next.next = new LListNode(2);
        head.next.next.next.next.next.next= new LListNode(1);


        LListNode fast = head;
        LListNode slow = head;
        while(fast!=null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle node : "+slow.value);
        LListNode curr = slow;
        LListNode prev = null;
        while(curr!=null){
            LListNode nextNode =curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        LListNode left = head;
        LListNode right = prev;
        boolean isPalindrome = true;
        while(right!=null){
            if(left.value != right.value){
                isPalindrome= false;
                break;
            }
            right = right.next;
            left = left.next;

        }
        if(isPalindrome){
            System.out.println("is a palindrome");
        } else{
            System.out.println("Not a palindrome");
        }


        }
    }

