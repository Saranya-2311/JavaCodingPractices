package janTwentySix.PrefixSum;

public class RangeSum {

    public static void main(String[] args){
        int[] arr = {7,9,3,2,8,10};
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(prefixSum[i]);
        }
        int l = 2;
        int r = 5;
        int result;
        if(l==0){
            result = prefixSum[r];
        }else {
            result = prefixSum[r] - prefixSum[l - 1];
        }
        System.out.println("result="+result);
    }

    }

