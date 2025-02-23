package hashing;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

public static void main(String[] args){
    int[] nums = {3,2,4};
    int[] result = twoSum(nums,6);
    System.out.println("result = "+ result[0]+" " +result[1]);
}
    public static int[] twoSum(int[] nums, int target) {

        int complement;
        Map<Integer, Integer> numsHash = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numsHash.put (nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            complement = target - nums[i];
            if (numsHash.containsKey(complement) && numsHash.get(complement) != i) {
                return new int[]{numsHash.get(complement), i};
            }
            numsHash.put(nums[i], i);
        }
      return new int[]{};
    }
}
