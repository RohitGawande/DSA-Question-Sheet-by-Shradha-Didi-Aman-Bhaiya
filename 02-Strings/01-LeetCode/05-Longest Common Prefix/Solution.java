class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return ""; // No common prefix
        }

        // Start with the first string as the prefix
        String prefix = strs[0];

        // Iterate through the array
        for (int i = 1; i < strs.length; i++) {
            // Adjust the prefix by comparing it with the current string
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                // If the prefix becomes empty, there's no common prefix
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}
