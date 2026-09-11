package DSpractice;

public class SortColorsDutchFlag {
    public static void main(String[] args){
        int[] arr = {2,0,2,1,1,0};
        int low =0;
        int mid =0;
        int high = arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            } else if(arr[mid]==2){
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            } else{
                mid++;
            }
  }

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
