package dsaPractice.pattern.twoPointers;

public class TwoSum {

    public static void main(String[] args){
        int[] arr ={1,2,3,4,5,6};
        int target = 7;
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int sum = arr[left]+arr[right];
            if(sum > target){
                right--;
            }else if (sum<target){
                left ++;
            } else if(sum == target)
                break;
        }
        System.out.println("arr indices are : "+ left +" ,"+right);
    }
}
