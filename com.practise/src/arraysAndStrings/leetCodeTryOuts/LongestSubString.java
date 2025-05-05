package arraysAndStrings.leetCodeTryOuts;

import java.util.HashMap;
import java.util.Map;

public class LongestSubString {
    public static void main(String[] args) {
        String str = "abcabcdabc";
        String subString = getLongestSubstring(str);
        System.out.println("subString = " + subString);
    }

    private static String getLongestSubstring(String str) {
        Map<Character, Integer> charIndexMap = new HashMap<>();
        int start = 0, maxLength = 0, startOfLongest = 0;

        for (int end = 0; end < str.length(); end++) {
            char currentChar = str.charAt(end);

            // If the character is already in the map and its index is within the current window
            if (charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= start) {
                start = charIndexMap.get(currentChar) + 1;
            }

            charIndexMap.put(currentChar, end);

            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                startOfLongest = start;
            }
        }

        return str.substring(startOfLongest, startOfLongest + maxLength);

    }
}
