package janTwentySix.HashMapPrbm;

import java.util.HashMap;
import java.util.Map;

public class FindingFirstUniqueChar {
    public static void main(String[] args){
        String string = "Saranya";
        HashMap<Character,Integer> map = new HashMap<>();
        char[] charArr = string.toLowerCase().toCharArray(); // to make capital and small case the same.
        for(int i= 0; i<charArr.length;i++){
          map.put(charArr[i],map.getOrDefault(charArr[i],0)+1);
        }
        char uniqueChar = 0;
        for(int i=0;i<charArr.length;i++){
            if(map.get(charArr[i])==1){
                uniqueChar = charArr[i];
                break;
            }
        }
        System.out.println("uniqueChar: "+ uniqueChar);
    }
}
