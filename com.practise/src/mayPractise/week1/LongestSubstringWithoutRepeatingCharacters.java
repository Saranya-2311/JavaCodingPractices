package mayPractise.week1;
import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int findLongestSubstring(String str){
        int maxLength = 0;
        HashSet<Character> hashSet = new HashSet<>();
        int left = 0; int right = 0;
        for(right =0;right < str.length();right++){
            while(hashSet.contains(str.charAt(right))){
                hashSet.remove(str.charAt(left));
                left++;
            }
                hashSet.add(str.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);

        }
        return  maxLength;
    }
    public static void main(String[] args){
        String s = "abcabcbb";
        System.out.println("Longest substring length: " + findLongestSubstring(s));
    }
}

