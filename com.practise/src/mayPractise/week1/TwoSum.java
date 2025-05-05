package mayPractise.week1;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args){

        int[] arr = {2,6,7,8}; int target=13;
        int[] result= findTwoSum(arr,target);
        if (result.length == 2) {
            System.out.println("Indices: " + Arrays.toString(result));
        } else {
            System.out.println("No pair found.");
        }
    }

    private static int[] findTwoSum(int[] arr,int target) {
        int complement=0;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i= 0; i< arr.length;i++){
            complement = target - arr[i];
            if (hashMap.containsKey(complement)){
                return new int[]{hashMap.get(complement), i};
            }
            hashMap.put(arr[i], i);
        }
        return new int[]{};

    }
}
