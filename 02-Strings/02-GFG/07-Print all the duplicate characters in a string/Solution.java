import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {
    public static void print(String s){
        char [] chars=s.toCharArray();
        Arrays.sort(chars);
        int count=1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i]==chars[i-1]) {
                count ++;
            }else{
                if (count>1) {
                    System.out.println(chars[i-1]+"count="+count);
                }
                count=1;
            }
        }
        if (count>1) {
            System.out.println(chars[chars.length-1]+"count="+count);
        }
    } 
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        print(s);
    }
}
