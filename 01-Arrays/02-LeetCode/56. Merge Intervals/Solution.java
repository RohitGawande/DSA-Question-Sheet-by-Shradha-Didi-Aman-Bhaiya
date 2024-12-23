import java.util.*;

public class Solution {
    public int[][] merge(int[][] intervals) {
        // Edge case: If intervals is empty, return an empty list
        if (intervals.length == 0) {
            return new int[0][0];
        }
        
        // Step 1: Sort intervals by their start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        
        // Step 2: Create a list to hold the merged intervals
        List<int[]> merged = new ArrayList<>();
        
        // Step 3: Initialize the first interval as the current interval
        int[] current = intervals[0];
        
        for (int i = 1; i < intervals.length; i++) {
            // If the current interval overlaps with the next interval
            if (current[1] >= intervals[i][0]) {
                // Merge by updating the end of the current interval to the max of the two ends
                current[1] = Math.max(current[1], intervals[i][1]);
            } else {
                // If no overlap, add the current interval to the result and move on to the next one
                merged.add(current);
                current = intervals[i];
            }
        }
        
        // Add the last interval
        merged.add(current);
        
        // Convert the list back to a 2D array
        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        int[][] intervals1 = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] intervals2 = {{1, 4}, {4, 5}};
        
        // Call the merge function and print the result
        System.out.println(Arrays.deepToString(solution.merge(intervals1)));  // Output: [[1, 6], [8, 10], [15, 18]]
        System.out.println(Arrays.deepToString(solution.merge(intervals2)));  // Output: [[1, 5]]
    }
}
