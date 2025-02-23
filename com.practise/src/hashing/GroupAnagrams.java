package hashing;
import java.util.*;
public class GroupAnagrams {

        public List<List<String>> groupAnagrams(String[] strs) {
            // Initialize hash map to store sorted characters and corresponding words
            Map<String, List<String>> anagramMap = new HashMap<>();

            for (String word : strs) {
                // Convert the word to a char array, sort it, and convert back to string
                char[] charArray = word.toCharArray();
                Arrays.sort(charArray);
                String sortedWord = new String(charArray);

                // Add the word to the list corresponding to the sorted key
                if (!anagramMap.containsKey(sortedWord)) {
                    anagramMap.put(sortedWord, new ArrayList<>());
                }
                anagramMap.get(sortedWord).add(word);
            }

            // Extract the groups of anagrams
            return new ArrayList<>(anagramMap.values());
        }

        public static void main(String[] args) {
            GroupAnagrams solution = new GroupAnagrams();
            String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
            List<List<String>> groups = solution.groupAnagrams(words);
            for (List<String> group : groups) {
                System.out.println(group);
            }
        }
    }


