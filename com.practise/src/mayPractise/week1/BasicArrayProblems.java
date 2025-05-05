package mayPractise.week1;

public class BasicArrayProblems {
    public static void main(String[] args){
        int[] arr= {0,5,5,60,20};
        int max= findMaxElement(arr);
        System.out.println("max="+max);
        int min= findMinElement(arr);
        System.out.println("min="+min);
        int sum =calculateSum(arr);
        System.out.println("sum="+sum);
        int avg =calculateAverage(arr);
        System.out.println("avg="+avg);
        int[] reversedArray=reverseArray(arr);
        for (int j : reversedArray) {
            System.out.println( "reversedArray="+ j);
        }
        int[] leftRotatedArray = leftRotation(arr,2);
        for (int j : leftRotatedArray) {
            System.out.println( "leftRotatedArray="+ j);
        }
        int[] rightRotatedArray = rightRotation(arr,2);
        for (int j : rightRotatedArray) {
            System.out.println( "rightRotatedArray="+ j);
        }

    }

    /**
     * Find the Maximum Element
     */
    public static int findMaxElement(int[] arr){
        int max=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]> max){
                max=arr[i];
            }
        }
        return max;
    }

    /**
     * Find the Minimum Element
     */
    public static int findMinElement(int[] arr){
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] < min ){
                min=arr[i];
            }
        }
        return min;
    }
    public static int calculateSum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        return sum;
    }
    public static int calculateAverage(int[] arr){
        return calculateSum(arr)/arr.length;
    }
    public static int[] reverseArray(int[] arr){
        for(int i=0,j=arr.length-1;i<j;i++,j--){
            int temp=0;
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        return arr;
    }
    public static int[] leftRotation(int[] arr,int noOfRotation){
        int n=arr.length;
        int[] newArray=new int[n];
        int j=0;
        noOfRotation=noOfRotation%n;
        for(int i=noOfRotation;i< n;i++,j++){
            newArray[j] = arr[i];
        }
        for(int i=0;i<noOfRotation;i++,j++){
         newArray[j]=arr[i];
        }
        return newArray;
    }
    public static int[] rightRotation(int[] arr,int noOfRotation)
    {
        int n = arr.length; int j=0;
        int[] newArray= new int[n];
        noOfRotation = noOfRotation % n;
        for(int i=arr.length-noOfRotation;i<arr.length;i++,j++){
            newArray[j]=arr[i];
        }
        for(int i=0;i< arr.length-noOfRotation;i++,j++){
            newArray[j] = arr[i];
        }
        return newArray;
    }
}
