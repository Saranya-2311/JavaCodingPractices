package DSpractice;

public class TwoSumSortedArray {
    public static void main(String[] args){
        int target = 9;
        int[] arr ={1};
        int[] result;
        result = getTwoSum(arr,target);
        if(result[0]==0 && result[1]==0){
            System.out.println("No two sum array found");
        }else{
            System.out.println("result= ["+result[0]+","+result[1]+"]");
        }



    }

    private static int[] getTwoSum(int[] arr, int target) {
        int[] result = new int[2];
        if(arr == null || arr.length < 2){
            System.out.println("Invalid Array");
            return result;
        }
        int left=0; int right =arr.length-1;
        while(left< right){
            int currentSum = arr[left] + arr[right];
            if(currentSum == target){
                result[0] = left+1;
                result[1] = right+1;
                break;
            }else if(currentSum > target){
                right--;
            }else {
                    left++;
            }
            }


        return result;
    }
}
