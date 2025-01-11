public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        
        // Loop through each character in the string as the starting point
        for (int i = 0; i < s.length(); i++) {
            String currentSubstring = ""; // To store the current substring without duplicates
            
            // Loop through the rest of the string from the current starting point
            for (int j = i; j < s.length(); j++) {
                char currentChar = s.charAt(j);
                
                // If the character is already in the substring, break the loop
                if (currentSubstring.contains(String.valueOf(currentChar))) {
                    break;
                }
                
                // Otherwise, add the character to the substring
                currentSubstring += currentChar;
                
                // Update the maxLength if the current substring is longer
                maxLength = Math.max(maxLength, currentSubstring.length());
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Length of longest substring without repeating characters: " + lengthOfLongestSubstring(s));
    }
}
