import java.util.Arrays;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        printDuplicateCharacters(s);
    }

    public static void printDuplicateCharacters(String s) {
        // Convert the string to a character array and sort it
        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        // Traverse the sorted array and count duplicates
        System.out.println("Duplicate characters in the string:");
        int count = 1; // To count occurrences of a character
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                count++;
            } else {
                // If the count of the previous character is greater than 1, print it
                if (count > 1) {
                    System.out.println(chars[i - 1] + ", count = " + count);
                }
                count = 1; // Reset count for the new character
            }
        }

        // Handle the last character in the array
        if (count > 1) {
            System.out.println(chars[chars.length - 1] + ", count = " + count);
        }
    }
}
