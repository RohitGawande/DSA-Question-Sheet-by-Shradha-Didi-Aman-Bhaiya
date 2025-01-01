class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        int[] freq = new int[26]; // Array to store character frequencies
        
        // Loop through both strings
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++; // Increment frequency for s
            freq[t.charAt(i) - 'a']--; // Decrement frequency for t
        }
        
        // Check if all frequencies are zero
        for (int count : freq) {
            if (count != 0) {
                return false; // Mismatch in character frequencies
            }
        }
        
        return true; // Strings are anagrams
    }
}
