package DSpractice;

public class QuickSortHoare {

    public static void main(String[] args){
        int[] arr = {10,17,8,5,8,9};
        quickSort(arr,0,arr.length-1);
        System.out.println("Sortedarray");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    private static void quickSort(int[] arr, int low, int high) {
        if(low<high){
            int partitonIndex = hoarePartition(arr,low,high);
            quickSort(arr,low,partitonIndex);
            quickSort(arr,partitonIndex+1,high);
        }
    }

    private static int hoarePartition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i=low-1;
        int j=high+1;
       while(true){
           do{
               i++;
           }while(arr[i]<pivot);
           do{
               j--;
           }while(arr[j]>pivot);
           if(i>=j){
               return j;
           }
           int temp = arr[i];
           arr[i]=arr[j];
           arr[j] = temp;
       }
    }
}
