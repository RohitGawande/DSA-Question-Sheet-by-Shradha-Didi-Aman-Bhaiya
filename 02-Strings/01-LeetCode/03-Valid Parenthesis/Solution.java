import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        // Initialize a stack to store open brackets
        Stack<Character> stack = new Stack<>();
        
        // Iterate through each character in the string
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                // Push open brackets onto the stack
                stack.push(c);
            } else {
                // For closing brackets, check if the stack is empty
                if (stack.isEmpty()) return false;

                // Pop the top of the stack and check if it matches the closing bracket
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false; // Mismatch found
                }
            }
        }
        
        // If the stack is empty, all brackets are matched
        return stack.isEmpty();
    }
}
