package DSpractice;

public class ContainerWithMaxWater {
    public static void main(String[] args){
        int[] arr = {8,2,5,3,6,5,2};
        int left = 0;
        int right = arr.length-1;
        int currArea = 0;
        int maxArea = 0;
        while(left<right){
            currArea = Math.min(arr[left],arr[right]) * (right-left);
            maxArea = Math.max(currArea,maxArea);
            if(arr[left]<arr[right] ){
                left++;
            }else{
                right--;
            }
        }
        System.out.println("maxArea= "+ maxArea);
    }
}
