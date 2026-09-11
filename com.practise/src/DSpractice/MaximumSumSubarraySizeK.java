package DSpractice;

public class MaximumSumSubarraySizeK {
    public static void main (String[] args){
        int[] arr ={4,5,6,7,2,3};
        int k =3;
        int sum =0;
        for(int i=0;i< k;i++){
            sum += arr[i];
        }
        int maxSum = sum;
        for(int right =k;right < arr.length;right++){
        sum = sum +arr[right] - arr[right-k];
        maxSum =Math.max(sum,maxSum);
        }
        System.out.println("Max Sum : "+maxSum);
    }
}
