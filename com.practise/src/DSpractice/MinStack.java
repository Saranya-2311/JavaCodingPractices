package DSpractice;

import java.util.ArrayDeque;
import java.util.Deque;

public class MinStack {
    public static void main(String[] args){
        int[] arr = {2,4,3,6,7,1};

        Deque<Integer> dataStack = new ArrayDeque<>();
        Deque<Integer> minStack = new ArrayDeque<>();

        for(int i = 0;i<arr.length;i++){
            int currentVal = arr[i];
            dataStack.push(currentVal);
            if (minStack.isEmpty() || currentVal <= minStack.peek()) {
                minStack.push(currentVal);
            }
          }
        System.out.println("Min elmt="+minStack.pop());
        }

    }

