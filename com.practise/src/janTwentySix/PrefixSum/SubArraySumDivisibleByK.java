package janTwentySix.PrefixSum;

import java.util.HashMap;

public class SubArraySumDivisibleByK {

    public static void main(String args[]){
        int[] arr ={1,1,4,5,-2,7,0};
        PivotIndex PivotIndex = new PivotIndex();
        int[] prefixSum = PivotIndex.findPrefixSum(arr);
        int k =5;
        int count = findSubArrayCountDivisibleByK(prefixSum,k);
        System.out.println("Count = "+ count);

    }

    private static int findSubArrayCountDivisibleByK(int[] prefixSum, int k) {
        int count =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);//Inititalisng the map
        for(int i = 0;i<prefixSum.length;i++){
            int mod = prefixSum[i] % k;
            if (mod < 0) {
                mod += k; // handle negative modulo
            }
            if(map.containsKey(mod)){
                count = count + map.get(mod);
            }
            map.put(mod,map.getOrDefault(mod,0)+1);
        }
        return count;
    }
}
