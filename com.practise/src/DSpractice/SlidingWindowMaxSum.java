package DSpractice;
// t0 find max sum of subarray of size K
public class SlidingWindowMaxSum {

    public static int findMaxSum(int[] arr,int k){
        int maxSum = Integer.MIN_VALUE; int windowSum = 0;
        // find first window sum
        for(int i=0;i<k;i++){
            windowSum += arr[i];
        }
        maxSum = windowSum;
        for(int i = k; i<arr.length;i++){
            windowSum +=arr[i] - arr[i-k];
            maxSum = Math.max(maxSum,windowSum);
        }
        return maxSum;
    }
    public static void main(String[] args){

        int[] arr = {1,5,6,7,5,8,9};
        int k=3;
        System.out.println("MaxSumArray = "+ findMaxSum(arr,k));

    }
}
