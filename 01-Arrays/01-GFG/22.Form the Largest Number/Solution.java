import java.util.Arrays;

public class Solution {
    public static String largestNumber(int[] arr) {
        // Step 1: Convert numbers to strings
        String[] strArr = Arrays.stream(arr)
                                .mapToObj(String::valueOf)
                                .toArray(String[]::new);

        // Step 2: Custom sorting logic
        Arrays.sort(strArr, (a, b) -> (b + a).compareTo(a + b));

        // Step 3: Handle edge case of all zeros
        if (strArr[0].equals("0")) {
            return "0";
        }

        // Step 4: Concatenate sorted strings
        return String.join("", strArr);
    }

    public static void main(String[] args) {
        int[] arr = {3, 30, 34, 5, 9};
        System.out.println(largestNumber(arr)); // Output: 9534330
    }
}
