package janTwentySix.twoPointers;

public class MoveZerotoEnd {
    public static void main(String[] args){

        int[] arr = {0,0,4,0,12,0};
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }

        }
        for(int k=0;k<arr.length;k++)
          System.out.println(arr[k]);

    }
}
