package mayPractise.week2;

import java.util.HashSet;

public class SubArrayHashing {
    public static void main(String[] args){
        int[] mainArray = {1,3,4,5,6,7};
        int[] subArray={4,0};
        boolean isSubArray = isSubArray(mainArray,subArray);
        System.out.println("isSubArray= "+isSubArray);
        }

    private static boolean isSubArray(int[] mainArray, int[] subArray) {
        boolean isSubArray = false;
        HashSet<Integer> hashMainArray = new HashSet<>();
        for(int num:mainArray) {
          hashMainArray.add(num);
        }
        for(int num : subArray){
            isSubArray= hashMainArray.contains(num);
        }
        return isSubArray;
    }
}

