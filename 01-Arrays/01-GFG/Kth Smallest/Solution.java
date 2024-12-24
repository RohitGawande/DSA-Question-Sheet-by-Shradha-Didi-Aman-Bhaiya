import java.util.*;

class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Step 1: Find the maximum element in the array
        int maxElement = 0;
        for (int num : arr) {
            maxElement = Math.max(maxElement, num);
        }

        // Step 2: Initialize the frequency array
        int[] freq = new int[maxElement + 1];

        // Step 3: Populate the frequency array
        for (int num : arr) {
            freq[num]++;
        }

        // Step 4: Traverse the frequency array to find the kth smallest element
        int count = 0;
        for (int i = 0; i <= maxElement; i++) {
            count += freq[i]; // Add the count of the current element
            if (count >= k) { // If we reach the kth smallest element
                return i;
            }
        }

        return -1; // In case k is invalid (shouldn't happen based on constraints)
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        System.out.println(kthSmallest(arr, k)); // Expected Output: 7
    }
}
