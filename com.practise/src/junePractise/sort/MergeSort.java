package junePractise.sort;

public class MergeSort {
    public static int[] array ={5,4,7,3,6,2,9,8};
    public static void main(String[] args){
        mergeSort(array,0,array.length-1);
        System.out.println("After Sorting : ");
        for(int num : array)
            System.out.println(num);

    }
    private static void mergeSort(int[] arr, int l, int r) {
        if(l<r) {
            int mid = ( l + r-1)/ 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }
    private static void merge(int[] arr, int l, int mid, int r) {

        int[] mergedArray = new int[r-l+1];
        int mCount = 0;
        int lCount = l;
        int rCount = mid+1;

        while(lCount <= mid && rCount <= r){
            if(arr[lCount]<arr[rCount]){
            mergedArray[mCount++] = arr[lCount++];
        } else{
                mergedArray[mCount++] = arr[rCount++];
            }
    }
        while(lCount <= mid){
            mergedArray[mCount++] = arr[lCount++];
        }
        while(rCount <= r){
            mergedArray[mCount++] = arr[rCount++];
        }

        for(int i=0;i<mergedArray.length;i++)
            array[l+i] = mergedArray[i];
    }
}
