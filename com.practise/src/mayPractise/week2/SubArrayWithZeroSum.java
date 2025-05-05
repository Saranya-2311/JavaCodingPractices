package mayPractise.week2;

import java.util.HashSet;


public class SubArrayWithZeroSum {
    public static void main(String[] args) {
    int[] arr= {-1,5,5,1};
    boolean subArrayExists = hasZeroSumSubArray(arr);
    System.out.println("subArrayExists= "+ subArrayExists);

}
    private static boolean hasZeroSumSubArray(int[] arr) {
        int prefixSum =0;
        HashSet<Integer> sumSet= new HashSet<>();
        for(int num : arr){
            prefixSum +=num;
            if(prefixSum ==0 || sumSet.contains(prefixSum)){
              return true;
            }else {
                sumSet.add(prefixSum);
            }
        }
        return false;
    }
}
