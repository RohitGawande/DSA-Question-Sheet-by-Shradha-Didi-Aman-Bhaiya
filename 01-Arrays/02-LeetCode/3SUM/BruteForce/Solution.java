import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {
    public static List<List<Integer>> threeSumBruteForce(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();

        int n = nums.length;

        // Iterate through all triplets
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        // Create a sorted triplet to avoid duplicates
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                        triplet.sort(null); // Sort the triplet to handle duplicates
                        set.add(triplet);  // Use HashSet to ensure uniqueness
                    }
                }
            }
        }

        // Convert set back to a list
        result.addAll(set);
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSumBruteForce(nums));
    }
}
