package DSpractice;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String args[]){
        int[] arr = {2,1,1,1,1,2,4};
        HashMap<Integer,Integer> freqMap = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            freqMap.put(arr[i],freqMap.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : freqMap.entrySet()){
            if(entry.getValue() > arr.length/2){
                System.out.println("majority elmt : "+ entry.getKey());
                break;
            }
        }


    }
}