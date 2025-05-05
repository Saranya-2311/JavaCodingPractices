package arraysAndStrings.leetCodeTryOuts;

import java.util.HashSet;

public class longestSubstringWithoutRepeatingCharacters {
    String s = "abcdabda";
    public static void main(String[] args){

    }
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> hashSet = new HashSet<>();
        int left = 0; // Start of the sliding window
        int maxLength = 0; // Maximum length of substring

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // If the character is already in the set, shrink the window from the left
            while (hashSet.contains(currentChar)) {
                hashSet.remove(s.charAt(left));
                left++;
            }

            // Add the current character to the set
            hashSet.add(currentChar);

            // Update the maximum length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
