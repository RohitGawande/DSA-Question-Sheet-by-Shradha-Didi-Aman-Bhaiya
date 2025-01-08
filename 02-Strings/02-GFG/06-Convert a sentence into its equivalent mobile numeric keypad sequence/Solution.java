public class Solution {
    public static String convertTokeypad(String sentence){
        String [] keypad={
            "2","22","222",
            "3","33","333",
            "4","44","444",
            "5","55","555",
            "6","66","666",
            "7","77","777","7777",
            "8","88","888",
            "9","99","999","9999"
        };
        StringBuilder result=new StringBuilder();
        for (char ch : sentence.toCharArray()) {
            if (ch==' ') {
                result.append(0);
            
            }else{
                char upperch=Character.toUpperCase(ch);
                int index=upperch-'A';
                result.append(keypad[index]);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String input1 = "GEEKSFORGEEKS";
        String input2 = "HELLO WORLD";

        System.out.println("Input: " + input1);
        System.out.println("Output: " + convertTokeypad(input1));
        
        System.out.println("Input: " + input2);
        System.out.println("Output: " + convertTokeypad(input2));
    }
}
