package DSpractice;

public class MaxAverageSubArrayI {
    public static void main(String[] args){
        int[] arr ={1,3,4,5,3,4};
        int k =3;
        int sum =0;
        for(int i=0;i<k;i++){
            sum += arr[i];
        }
        int maxSum = sum;
        for(int right = k ;right< arr.length;right++){
            sum = sum + arr[right]-arr[right-k];
            maxSum = Math.max(sum,maxSum);
        }
        double average = (double) maxSum/k;
        System.out.println("Max Aver="+ average);
    }
}
