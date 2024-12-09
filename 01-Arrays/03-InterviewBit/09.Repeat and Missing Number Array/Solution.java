public class Solution {
    public int[] findDuplicateAndMissing(int[] nums) {
        int n = nums.length;
        
        // Compute expected sums
        long expectedSum = (long) n * (n + 1) / 2;
        long expectedSumOfSquares = (long) n * (n + 1) * (2 * n + 1) / 6;
        
        // Compute actual sums
        long actualSum = 0, actualSumOfSquares = 0;
        for (int num : nums) {
            actualSum += num;
            actualSumOfSquares += (long) num * num;
        }
        
        // S = A - B
        long S = expectedSum - actualSum; 
        // S2 = A^2 - B^2
        long S2 = expectedSumOfSquares - actualSumOfSquares;
        
        // From S2 = (A - B)(A + B), we can compute A and B
        long A_plus_B = S2 / S;
        
        // Solving for A and B
        int A = (int) ((S + A_plus_B) / 2);
        int B = (int) (A - S);
        
        return new int[] {A, B};
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1
        int[] nums1 = {3, 1, 2, 5, 3};
        int[] result1 = solution.findDuplicateAndMissing(nums1);
        System.out.println("Duplicate: " + result1[0] + ", Missing: " + result1[1]); // Expected output: [3, 4]
    }
}
