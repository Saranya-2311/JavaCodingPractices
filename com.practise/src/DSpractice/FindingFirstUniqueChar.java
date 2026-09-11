package DSpractice;

import java.util.HashMap;

public class FindingFirstUniqueChar {
    public static void main(String[] args){
        String string = "aababuna";
        HashMap<Character,Integer> map = new HashMap<>();
        char[] charArr = string.toLowerCase().toCharArray(); // to make capital and small case the same.
        for(char c : charArr){
          map.put(c,map.getOrDefault(c,0)+1);
        }
        int uniqueChar = -1;
        for(int i=0;i<charArr.length;i++){
            if(map.get(charArr[i])==1){
                uniqueChar = i;
                break;
            }
        }
        System.out.println("uniqueChar: "+ charArr[uniqueChar]);
    }
}
