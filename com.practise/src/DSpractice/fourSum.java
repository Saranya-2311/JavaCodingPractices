package DSpractice;

import java.util.Arrays;

public class fourSum {
    public static void main(String[] args){
        int[] arr = {1,0,-1,0,-2,2};
        Arrays.sort(arr);
        for(int i=0; i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int left =j+1;
                int right = arr.length-1;
                while(left<right){
                    int sum = arr[i]+arr[j]+arr[left]+arr[right];
                    if(sum==0){
                        System.out.println(arr[i]+","+arr[j]+","+arr[left]+","+arr[right]);
                        left++;
                        right--;
                    }else if(sum< 0){
                        left++;
                    }else {
                        right--;
                    }
                }
            }
        }

    }
}
