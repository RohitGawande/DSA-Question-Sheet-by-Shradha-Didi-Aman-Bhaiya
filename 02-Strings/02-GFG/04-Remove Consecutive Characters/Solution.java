class Solution {
    public String removeConsecutiveCharacters(String s) {
        if (s == null || s.length() <= 1) {
            return s; // If string is empty or has one character, return as is.
        }

        StringBuilder result = new StringBuilder();
        result.append(s.charAt(0)); // Add the first character.

        for (int i = 1; i < s.length(); i++) {
            // Check if the current character is different from the previous one.
            if (s.charAt(i) != s.charAt(i - 1)) {
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }
}

    public static void main(String[] args) {
        String s="aabbcc";
        System.out.println(removeConse(s));
    }

