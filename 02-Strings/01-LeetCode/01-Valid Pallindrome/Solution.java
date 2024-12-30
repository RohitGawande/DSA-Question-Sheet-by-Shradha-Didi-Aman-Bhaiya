public class Solution {
    public static boolean isPalindrome(String s) {
        // Convert the string to lowercase
        s = s.toLowerCase();
        
        // Initialize two pointers
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            // Skip non-alphanumeric characters on the left
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            
            // Skip non-alphanumeric characters on the right
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            
            // Compare the characters
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            
            // Move pointers closer
            left++;
            right--;
        }
        
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // Output: true
        System.out.println(isPalindrome("race a car")); // Output: false
        System.out.println(isPalindrome(" ")); // Output: true
    }
}
