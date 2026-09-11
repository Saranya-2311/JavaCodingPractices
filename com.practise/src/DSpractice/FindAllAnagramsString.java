package DSpractice;

import java.util.Arrays;

public class FindAllAnagramsString {
    public static void main(String[] args){
        String s ="abbaab";
        String p ="ab";
        int k = p.length();
    char[] charP = p.toCharArray();
    Arrays.sort(charP);
        for(int right =0;right<=s.length()-k;right++){
            String str = s.substring(right,k+right);
          char[] charS = str.toCharArray();
            Arrays.sort(charS);
            if(Arrays.equals(charP,charS)){
                System.out.println("Index = " + right);
            }
        }
    }
}
