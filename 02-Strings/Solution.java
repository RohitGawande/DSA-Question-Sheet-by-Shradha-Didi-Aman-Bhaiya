public class Solution {
    public static boolean isPalindrom(String s){
        s=s.toLowerCase;
        int left=0;
        int right=s.length()-1;
        while (left<right) {
        while (left<right && !Character.isLetterOrDigit(s.charAt(left))) {
            left++;
        }
        while (left<right && !Character.isLetterOrDigit(s.charAt(right))) {
            right--;
        }
        if (s.charAt(right)!=s.charAt(left)) {
            return false;
        }
        left++;
        right--;
    }
    return true;

    }
    public static void main(String[] args) {
        System.out.println(isPalindrom("A man, a plan, a canal: Panama")); // Output: true
        System.out.println(isPalindrom("race a car")); // Output: false
       
    }
}
