import java.util.*;

public class Solution {
    public static void rearrange(int[] arr, int n) {
        int j = 0; // Pointer for non-multiples of 10
        
        // Traverse array
        for (int i = 0; i < n; i++) {
            if (arr[i] % 10 != 0) { // Non-multiples of 10
                // Swap elements to move non-multiples to the front
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++; // Increment non-multiples pointer
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 12, 5, 40, 30, 7, 5, 9, 10};
        int n = arr.length;
        
        rearrange(arr, n);
        
        // Print rearranged array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
