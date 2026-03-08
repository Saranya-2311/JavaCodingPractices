package janTwentySix.HashMapPrbm;

import java.util.HashMap;
import java.util.Map;

import static java.util.Map.entry;

public class MajorityElement {

    public static void main(String args[]){
        int[] arr = {2,1,1,1,1,2,4};
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > arr.length/2){
                System.out.println("majority elmt : "+ entry.getKey());
                break;
            }
        }


    }
}