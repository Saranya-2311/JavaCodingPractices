package DSpractice;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4};
        int[] answer = new int[nums.length];

        for(int i =0;i<nums.length;i++) {

            if(i ==0 ){
                answer[i] =1;
            } else {
                answer[i] = answer[i - 1] * nums[i - 1];
            }

        }
        int product = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            answer[i] = answer[i]*product;
           product = product * nums[i];
        }

        for(int i =0;i<answer.length;i++){
            System.out.println(answer[i]);

        }


    }
}
