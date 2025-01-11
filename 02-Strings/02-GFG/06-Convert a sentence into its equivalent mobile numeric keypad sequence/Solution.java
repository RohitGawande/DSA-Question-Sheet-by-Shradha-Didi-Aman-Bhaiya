public class Solution {
    public static String convertToKeypad(String sentence) {
        String[] keypad = {
            "2", "22", "222",    // A, B, C
            "3", "33", "333",    // D, E, F
            "4", "44", "444",    // G, H, I
            "5", "55", "555",    // J, K, L
            "6", "66", "666",    // M, N, O
            "7", "77", "777", "7777", // P, Q, R, S
            "8", "88", "888",    // T, U, V
            "9", "99", "999", "9999" // W, X, Y, Z
        };

        StringBuilder result = new StringBuilder();

        for (char ch : sentence.toCharArray()) {
            if (ch == ' ') {
                result.append("0"); // Append 0 for space
            } else {
                // Convert character to uppercase (to handle lowercase inputs)
                char upperCh = Character.toUpperCase(ch);
                // Find the index based on 'A' (ASCII value subtraction)
                int index = upperCh - 'A';
                result.append(keypad[index]);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input1 = "GEEKSFORGEEKS";
        String input2 = "HELLO WORLD";

        System.out.println("Input: " + input1);
        System.out.println("Output: " + convertToKeypad(input1));

        System.out.println("Input: " + input2);
        System.out.println("Output: " + convertToKeypad(input2));
    }
}
