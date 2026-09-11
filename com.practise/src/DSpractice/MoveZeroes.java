package DSpractice;

public class MoveZeroes {
    public static void main(String[] args){
        int[] arr = {0,1,1,0,3,5,0,5};
        int slow = 0;
        int fast = 0;
        while (fast<arr.length){
            if(arr[fast]!=0){
                arr[slow] = arr[fast];
                slow++;
            }
                fast++;

        }
        for(int i= slow;i<arr.length;i++) {
            arr[i] = 0;
        }

        for (int j : arr) {
            System.out.println(j);
        }
    }
}
