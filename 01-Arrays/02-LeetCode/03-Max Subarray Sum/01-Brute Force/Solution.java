public class Solution {
    public static int subArr(int ar[]){
      int n=ar.length;
      int maxSum=Integer.MIN_VALUE;
        for (int i = 0; i <n; i++) {
            int currSum=0;
            for (int j = i; j <n; j++) {
                currSum+=ar[j];
                maxSum=Math.max(currSum, maxSum);
            }
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
