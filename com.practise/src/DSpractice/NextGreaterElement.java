package DSpractice;

import java.util.ArrayDeque;
import java.util.Deque;

public class NextGreaterElement {
    public static void main(String[] args){
        int[] arr = {2,10,5};
        int[] result = new int[arr.length];
        Deque<Integer> stack = new ArrayDeque<>();

        for(int i = arr.length-1;i>=0;i--){
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        for(int i = 0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}
