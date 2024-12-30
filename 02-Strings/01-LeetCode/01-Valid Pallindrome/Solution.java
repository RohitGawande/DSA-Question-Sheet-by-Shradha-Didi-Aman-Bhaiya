public class Solution {
    public static  boolean isPallindrome(String s){
        s=s.toLowerCase();
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
        String s="Rohit";
        String s1="Rohor";
        System.out.println(isPallindrome(s));
        System.out.println(isPallindrome(s1));
    }
}
