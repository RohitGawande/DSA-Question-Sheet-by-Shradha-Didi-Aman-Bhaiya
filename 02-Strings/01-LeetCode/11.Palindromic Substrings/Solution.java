class Solution {
    public int countSubstrings(String s) {
        int count = 0;

        // Iterate through each character as a potential center
        for (int center = 0; center < s.length(); center++) {
            // Odd-length palindromes
            count += expandAroundCenter(s, center, center);
            // Even-length palindromes
            count += expandAroundCenter(s, center, center + 1);
        }

        return count;
    }

    // Helper function to expand around the center
    private int expandAroundCenter(String s, int left, int right) {
        int count = 0;

        // Expand while the characters at the ends match
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++; // Found a palindrome
            left--;  // Move left pointer outward
            right++; // Move right pointer outward
        }

        return count;
    }
}
