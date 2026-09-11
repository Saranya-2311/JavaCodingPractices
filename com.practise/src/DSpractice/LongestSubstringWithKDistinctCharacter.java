package DSpractice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithKDistinctCharacter {
    public static void main(String[] args){
        String str = "Saranya";
        String subString = longestSubstring(str,2);
        System.out.println("SubString = "+ subString);
    }
    public static String longestSubstring(String s,int k){
        Map<Character, Integer> charIndexMap = new HashMap<>();
        int left = 0, maxLength = 0, startIdx = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            charIndexMap.put(c, right);
            while (charIndexMap.size() > k){
                int minIndex = Collections.min(charIndexMap.values());
                charIndexMap.remove(s.charAt(minIndex));
                left = minIndex + 1;
            }
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                startIdx = left;
            }
        }
        return s.substring(startIdx, startIdx + maxLength);
    }
}
