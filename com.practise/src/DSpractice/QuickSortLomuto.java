package DSpractice;

public class QuickSortLomuto {

    public static void main(String[] args) {
        int[] arr = {3, 1, 6, 8, 4, 6};
        quickSorting(arr, 0, arr.length - 1);
        for (int k = 0; k < arr.length; k++)
            System.out.println(arr[k]);
    }

    private static void quickSorting(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSorting(arr, low, pivotIndex - 1);
            quickSorting(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int i = low - 1;
        int pivot = arr[high];
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;

    }
}
