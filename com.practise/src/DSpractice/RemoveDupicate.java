package DSpractice;

public class RemoveDupicate {
    public static void main(String[] args){
        int[] arr = {1,1,2,2,3,3,3,4};
        int slow = 0;
        int fast = 1;
        while(fast< arr.length){
            if(arr[slow]==arr[fast]){
                fast++;
            }else{
                slow++;
                arr[slow]= arr[fast];
                fast++;
            }
        }
        for(int i =0 ;i< slow+1 ;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
