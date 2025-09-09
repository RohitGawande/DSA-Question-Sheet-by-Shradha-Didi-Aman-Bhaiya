public class Solution {
   public static int subArr(int nums[]){
    int currSum=nums[0];
    int maxSum=nums[0];
    for (int i = 1; i < nums.length; i++) {
        currSum=Math.max(nums[i], nums[i]+currSum);
        maxSum=Math.max(maxSum, currSum);
    }
    return maxSum;
   }
public static void main(String[] args) {
    
int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums2 = {1};
        int[] nums3 = {5, 4, -1, 7, 8};

        System.out.println(subArr(nums1)); // 6
        System.out.println(subArr(nums2)); // 1
        System.out.println(subArr(nums3)); // 23
    
}
}
