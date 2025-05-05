package arraysAndStrings.leetCodeTryOuts;

public class ContainerWithMostWater {
    public static void main(String[] args){
        int[] arr={1, 8, 6, 2, 5, 4, 8, 3, 7};
        int capacity = findContainerWithMostWater(arr);
        System.out.println("maxCapacity= "+capacity);
    }
    public static int findContainerWithMostWater(int[] arr) {
       int i=0; int j=arr.length-1; int maxWater=0;

       while(i<j){
           int initialWater =Math.min(arr[i],arr[j])*(j-i);// (1*3 = 3)
           maxWater = Math.max(maxWater,initialWater);
           if(arr[i]<arr[j] ){
              i++;
           } else{
               j--;
           }
       }
        return maxWater;
    }
}
