package janTwentySix.slidingWindow;

public class SmallestSubarrayforaGivenSum {
    public static void main(String[] args) {
        int[] arr = {5, 5,4, 5, 1, 8};
        int windowStart = 0;
        int givenSum = 10;
        int windowSum = 0;
        int length = Integer.MAX_VALUE;
        for(int windowEnd = 0;windowEnd < arr.length;windowEnd++){
            windowSum = windowSum +arr[windowEnd];

            while (windowSum >= givenSum){
                length = Math.min(length, windowEnd - windowStart + 1);
                windowSum = windowSum - arr[windowStart];
                windowStart++;
            }


        }
        length = (length == Integer.MAX_VALUE) ? 0 : length;
        System.out.println("length= "+ length);

    }
}
