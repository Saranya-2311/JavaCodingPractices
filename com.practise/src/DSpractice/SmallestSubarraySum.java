package DSpractice;

public class SmallestSubarraySum {

        public static int findSmallestSubarraySum(int[] arr, int k){
            int minLength = Integer.MAX_VALUE; int windowSum = 0; int left =0;

            for(int right =0;right <arr.length;right++) {
                windowSum += arr[right];

                while (windowSum >= k) {
                    minLength = Math.min(minLength, right - left + 1);
                    windowSum -= arr[left];
                    left++;
                }
            }
            return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
        }
    public static void main(String[] args){

        int[] arr = {1,5,6,7,5,8,9};
        int k=15;
        System.out.println("MaxSumArray = "+ findSmallestSubarraySum(arr,k));

    }
}
