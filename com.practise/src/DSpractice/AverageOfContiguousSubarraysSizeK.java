package DSpractice;

public class AverageOfContiguousSubarraysSizeK {
    public static void main(String[] args) {
        int[] arr = {0, 8, 0, 2, 5, 4, 8, 3, 7};
        int k = 5;
        double[] resultArray = new double[arr.length - k + 1];
        int windowStart = 0;
        double windowSum = 0;
        for(int windowEnd=0;windowEnd<arr.length;windowEnd++){
            windowSum +=arr[windowEnd];
            if (windowEnd >= k - 1) {
                resultArray[windowStart] = windowSum / k; // Calculate Average
                windowSum -= arr[windowStart];            // Subtract the "Leaver"
                windowStart++;                            // Slide the Anchor forward
            }
        }
        for(int i=0;i<resultArray.length;i++){
            System.out.println(resultArray[i]);
        }
    }


}
