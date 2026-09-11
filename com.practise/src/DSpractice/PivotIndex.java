package DSpractice;

public class PivotIndex {

    public static void main(String[] args){
        int arr[] ={1,3,5,3,1};
        int pivotIndex = findPivotIndex( arr);
        System.out.println("pivotIndex: "+ pivotIndex);
    }
    public static int[] findPrefixSum(int[] arr){
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }
      return prefixSum;
    }

    public static int findPivotIndex(int[] arr){


        int[] prefixSum = findPrefixSum(arr);
        int totalSum = prefixSum[prefixSum.length-1];

        for(int i = 0;i<prefixSum.length;i++){
            int leftSum = (i == 0) ? 0 : prefixSum[i-1];
            int rightSum = totalSum - prefixSum[i];
            if(leftSum == rightSum){
                return i;
            }
        }
        return -1;

    }
}
