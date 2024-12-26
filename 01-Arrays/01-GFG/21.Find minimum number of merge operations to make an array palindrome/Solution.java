class Solution {
    public int minMergeOperations(int[] arr) {
        int left = 0, right = arr.length - 1;  // Two pointers: left starts from 0 and right starts from the last index.
        int mergeCount = 0;  // To count the number of merge operations.

        // While left pointer is less than right pointer, the array is not a palindrome yet.
        while (left < right) {
            if (arr[left] == arr[right]) {
                // If the elements at the left and right are equal, no merge is needed.
                left++;   // Move the left pointer inward.
                right--;  // Move the right pointer inward.
            } else if (arr[left] < arr[right]) {
                // If the element on the left is smaller, merge arr[left] with arr[left + 1].
                arr[left + 1] += arr[left];  // Replace arr[left + 1] with the sum of arr[left] and arr[left + 1].
                left++;  // Move the left pointer to the next element.
                mergeCount++;  // Increment the merge count because we performed one merge.
            } else {
                // If the element on the right is smaller, merge arr[right] with arr[right - 1].
                arr[right - 1] += arr[right];  // Replace arr[right - 1] with the sum of arr[right] and arr[right - 1].
                right--;  // Move the right pointer to the previous element.
                mergeCount++;  // Increment the merge count because we performed one merge.
            }
        }

        return mergeCount;  // Return the number of merge operations performed.
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1
        int[] arr1 = {15, 4, 15};
        System.out.println(solution.minMergeOperations(arr1));  // Output: 0
        
        // Test case 2
        int[] arr2 = {1, 4, 5, 1};
        System.out.println(solution.minMergeOperations(arr2));  // Output: 1
        
        // Test case 3
        int[] arr3 = {11, 14, 15, 99};
        System.out.println(solution.minMergeOperations(arr3));  // Output: 3
    }
}
