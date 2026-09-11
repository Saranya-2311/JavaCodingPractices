package DSpractice;

import java.util.ArrayDeque;
import java.util.Deque;

public class DailyTemperature {
    public static void main(String[] args){
        int[] arr = {73,74,72,75};
        //Initialization
        int[] result = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            result[i]=0;
        }
        Deque<Integer> stack = new ArrayDeque<>();
        // find the indices

        for(int i =0;i< arr.length;i++){

            while(!stack.isEmpty() && arr[i] > arr[stack.peek()]){
              result[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }
     for(int i =0;i< result.length;i++){
         System.out.println(result[i]+",");
     }
    }
}
