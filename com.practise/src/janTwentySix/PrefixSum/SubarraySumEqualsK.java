package janTwentySix.PrefixSum;

import java.util.HashMap;

public class SubarraySumEqualsK {

    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 2, 6, 7, 5, -1};
        int k = 4;
        int countOfSubArrays = findSubArraySum(arr, k);
        System.out.println("countOfSubArrays: " + countOfSubArrays);

    }

    public static int[] findPrefixSum(int[] arr) {
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        return prefixSum;
    }

    private static int findSubArraySum(int[] arr, int k) {

        int[] prefixSum = findPrefixSum(arr);
        int subarrayCount = 0;
        int sum =0;
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        map.put(0,1);
        for (int j = 0; j < prefixSum.length; j++) {
            sum = prefixSum[j] - k;
            if(map.containsKey(sum)){
                subarrayCount = subarrayCount+ map.get(sum);
            }
            map.put(prefixSum[j],map.getOrDefault(prefixSum[j], 0) + 1);
        }
        return subarrayCount;


    }
}