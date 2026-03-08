package janTwentySix.slidingWindow;

public class MaximumSumSubarraySizeK {
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 7, 8};
        int currentSum=0;
        int maxSum = Integer.MIN_VALUE;
        int k=3;
        int windowStart=0;
        System.out.println("MaxSum : "+maxSum);
        for(int windowEnd=0;windowEnd<arr.length;windowEnd++){
            currentSum = currentSum + arr[windowEnd];
            if(windowEnd >= k-1 ){
                maxSum = Math.max(currentSum,maxSum);
                currentSum -= arr[windowStart];
                windowStart++;
            }
        }
        System.out.println("MaxSum : "+maxSum);
    }
}
