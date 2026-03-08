package janTwentySix.kadaneAlgo;

public class MaxSubArrayIndex {
    public static void main(String[] args) {
        int[] arr={-5,4,-1,7,-8};
        int maxEndsHere = arr[0];
        int maxValue = arr[0]; int startIndex=0; int endIndex=0;
        int tempStart = 0; // Tracks the start of the CURRENT subarray
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxEndsHere + arr[i]) {
                maxEndsHere = arr[i];
                tempStart = i; // Reset the start to current index
            } else {
                maxEndsHere += arr[i];
            }

            if (maxEndsHere > maxValue) {
                maxValue = maxEndsHere;
                startIndex = tempStart; // Capture the start of the BEST subarray
                endIndex = i;           // Current index is the end of the BEST subarray
            }
        }
        System.out.println("Max "+maxValue + "startIndex= "+ startIndex+" endIndex= "+endIndex);
    }
}
