import java.util.Arrays;

public class Solution {
    public static String larget(int arr[]){
       String []str= Arrays.stream(arr).mapToObj(String::valueOf).toArray(String []::new);
        Arrays.sort(str,(a,b)-> (b+a).compareTo(a+b));
        if (str[0].equals("0")) {
            return "0";
        }
        return String.join("", str);
    }
    public static void main(String[] args) {
        int[] arr = {3, 30, 34, 5, 9};
        System.out.println(larget(arr));
    }
}
