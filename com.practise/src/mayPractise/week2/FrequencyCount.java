package mayPractise.week2;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {
    public static void main(String[] args){
        int[] Array = {1,3,3,4,5,6,7,6,4};
        HashMap<Integer,Integer> hashMap = getFrequencyCount( Array);
        for(Map.Entry<Integer, Integer> num : hashMap.entrySet()) {
            System.out.println(num);
        }
    }

    private static HashMap<Integer,Integer> getFrequencyCount(int[] arr) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i=0; i< arr.length;i++){
        if(hashMap.containsKey(arr[i])){
            hashMap.put(arr[i],hashMap.get(arr[i])+1);
        }else {
                hashMap.put(arr[i],1);
            }
        }
        return hashMap;
    }
}
