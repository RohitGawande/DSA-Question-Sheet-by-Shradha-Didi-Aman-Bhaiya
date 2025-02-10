class Solution {
    int longestPrefixSuffix(String s) {
        int n = s.length();  // Length of the string
        int[] lps = new int[n]; // LPS array to store longest prefix-suffix values

        int len = 0;  // Length of the previous longest prefix suffix
        int i = 1;  // Start from the second character since the LPS of the first is always 0

        while (i < n) {
            if (s.charAt(i) == s.charAt(len)) {  // When characters match
                len++;  // Increment length of the current LPS
                lps[i] = len;  // Store the value in the LPS array
                i++;  // Move to the next character
            } else {  // When characters don't match
                if (len != 0) {
                    // Move back to the previous longest prefix length
                    len = lps[len - 1];  
                } else {
                    lps[i] = 0;  // No match, so set LPS to 0
                    i++;  // Move to the next character
                }
            }
        }

        // The last value in the LPS array gives the answer
        return lps[n - 1];
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.longestPrefixSuffix("abcgdsabc"));
    }
}
