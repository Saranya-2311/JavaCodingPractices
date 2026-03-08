package janTwentySix.HashMapPrbm;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args){
        int[] arr = {1,3,1,5,6,5}; int target = 10;
        int[] indexArr= new int[2] ;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int complement = target- arr[i];
            if(map.containsKey(complement)){
                indexArr[0] = map.get(complement);
                indexArr[1] = i;
                break;
            }
            map.put(arr[i],i);
        }
        System.out.println("result : ("+ indexArr[0]+","+indexArr[1]+")");
    }
}
