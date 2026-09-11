package DSpractice;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class ValidParenthesis {
    public static void main(String[] args) {

        // 1. Map closing brackets to their matching opening brackets
        Map<Character, Character> parenthesisMap = new HashMap<>();
        parenthesisMap.put('}', '{');
        parenthesisMap.put(']', '[');
        parenthesisMap.put(')', '(');

        Deque<Character> stack = new ArrayDeque<>();
        String parenthesisStr = "[]{{}}";
        boolean isValid = true;

        for (int i = 0; i < parenthesisStr.length(); i++) {
            char currChar = parenthesisStr.charAt(i);

            // 2. Check if it's a closing bracket
            if (parenthesisMap.containsKey(currChar)) {
                // If stack is empty or the top doesn't match the map's value, it's invalid
                if (stack.isEmpty() || stack.pop() != parenthesisMap.get(currChar)) {
                    isValid = false;
                    break;
                }
            } else {
                // 3. If it's an opening bracket, push it onto the stack
                stack.push(currChar);
            }
        }

        // 4. Final check: the stack must be empty to be truly valid
        if (isValid && !stack.isEmpty()) {
            isValid = false;
        }

        System.out.println("Is the string valid? " + isValid);
    }
}