package DSpractice;


public class MaximumSubarray53 {
    public static void main(String[] args){
        int[] arr={-5,-4,-1,-7,-8};
        int maxEndsHere = arr[0];
        int maxValue = arr[0];

        for(int i=1;i<arr.length;i++){
          maxEndsHere = Math.max(arr[i],maxEndsHere+ arr[i]);
          maxValue = Math.max(maxEndsHere,maxValue);
        }
        System.out.println("Max "+maxValue);
    }

}
