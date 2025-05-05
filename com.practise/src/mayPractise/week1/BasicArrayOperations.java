package mayPractise.week1;

public class BasicArrayOperations {
    public static void main(String[] args) {
        int[] arr = {1, 8, 5, 6};
        int[] newArray, mergedArray;
        int elmt = 6;
        int pos = 2;
        newArray = arr.clone();
        for (int j : newArray) {
            System.out.println("cloned array " + pos + " newArray= " + j);
        }
        newArray = insertAtPosition(arr, elmt, pos);
        for (int j : newArray) {
            System.out.println("insertAtPosition " + pos + " newArray= " + j);
        }
        newArray = deleteAtPosition(arr, pos);
        for (int j : newArray) {
            System.out.println("deleteAtPosition " + pos + " newArray= " + j);
        }
        int elmtPos = elementToFind(arr, 5);
        System.out.println("elementToFind:: Index= " + elmtPos);

        newArray = sortArray(arr);
        for (int j : newArray) {
            System.out.println("sortArray:  " + j);
        }
        mergedArray = mergeArraysWithoutSorting(arr, newArray);
        for (int j : mergedArray) {
            System.out.println("mergedArray:  " + j);
        }
    }

    public static int[] insertAtPosition(int[] arr, int elmt, int pos) {
        int[] newArray = new int[arr.length + 1];
        System.arraycopy(arr, 0, newArray, 0, pos);
        newArray[pos] = elmt;
        System.arraycopy(arr, pos, newArray, pos + 1, arr.length - pos);
        return newArray;
    }

    public static int[] deleteAtPosition(int[] arr, int pos) {
        int[] newArray = new int[arr.length - 1];
        System.arraycopy(arr, 0, newArray, 0, pos);
        System.arraycopy(arr, pos + 1, newArray, pos, arr.length - pos - 1);
        return newArray;
    }

    public static int elementToFind(int[] arr, int elmt) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elmt) {
                return i;
            }
        }
        return -1;
    }

    public static int[] sortArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = 0;
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        return arr;
    }

    public static int[] mergeArraysWithoutSorting(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            mergedArray[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            mergedArray[arr1.length + i] = arr2[i];
        }
        return mergedArray;
    }

    public static int[] mergeArrayWithSorting(int arr1[], int arr2[]) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int i = 0, j = 0,k=0;
        while (i < arr1.length && j < arr2.length) {
                if (arr1[i] <= arr2[j]) {
                    mergedArray[k] = arr1[i];
                    i++;
                }else {
                    mergedArray[k]=arr2[j];
                }
                k++;
            }
        while(i<arr1.length){
            mergedArray[k]=arr1[i];
            i++;
            k++;
        }
       while(j<arr2.length){
            mergedArray[k]=arr2[j];
            j++;
            k++;
        }
        return mergedArray;
    }
}



