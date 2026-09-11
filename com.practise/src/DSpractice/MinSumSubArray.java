package DSpractice;

public class MinSumSubArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 3};
        int target = 7;

        int left = 0;
        int right = 0;
        int currentSum = 0;
        int minLength = Integer.MAX_VALUE;

        for (right = 0; right < arr.length; right++) {

            currentSum += arr[right];

            while (currentSum >= target) {

                minLength = Math.min(minLength, right - left + 1);

                currentSum -= arr[left];
                left++;
            }
        }

        if (minLength == Integer.MAX_VALUE)
            System.out.println(0);
        else
            System.out.println(minLength);
    }

}
