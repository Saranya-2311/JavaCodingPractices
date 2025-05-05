package mayPractise.week1;

import static java.lang.Math.max;

public class MaximumSubArray {
    public static void main(String[] args){
        int[] nums = {3,-1,-3,4,2,-6,4};
        int result = getMaximumSubArray(nums);
        System.out.println("result = "+ result);
    }

    private static int getMaximumSubArray(int[] nums) {
        int maxSum = nums[0];int tempSum = nums[0];
        for(int i=1;i<nums.length;i++){
            tempSum = max(nums[i],tempSum+nums[i]);
            maxSum = max(tempSum,maxSum);
        }
        return maxSum;

    }

}
