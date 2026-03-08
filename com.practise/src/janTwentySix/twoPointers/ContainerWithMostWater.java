package janTwentySix.twoPointers;

public class ContainerWithMostWater {

    public static void main(String[] args){
        int[] arr={1, 8, 6, 2, 5, 4, 8, 3, 7};
        int left=0;
        int right = arr.length-1;
        int maxArea =0;
        int currentArea=0;
        while(left<right){

            int width = right-left;
            int height= Math.min(arr[left],arr[right]);
            currentArea = width* height;
            maxArea =Math.max(maxArea, currentArea);
            if(arr[left]<arr[right]){
                left++;
            } else{
                right--;
            }
        }
        System.out.println("area:" + maxArea);
    }
}
