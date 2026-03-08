package janTwentySix.twoPointers;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] arr = {1, 1, 4, 4, 12, 0};
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[j] != arr[i]){
               j++;
               arr[j]=arr[i];
            }
        }
        for(int k=0;k<arr.length;k++)
            System.out.println(arr[k]);
    }
}
