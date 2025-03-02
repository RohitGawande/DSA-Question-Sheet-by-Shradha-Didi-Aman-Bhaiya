import java.util.*; 

public class Solution { 
    // Function to rotate the array clockwise by k
    static int[] rotate(int nums[], int n, int k) { 
        // Normalize k to avoid unnecessary rotations
        k = k % n; 
        
        // Create a new array to store the result
        int[] ans = new int[n]; 
        
        // Copy the last k elements to the start of the new array
        for (int i = 0; i < k; i++) { 
            ans[i] = nums[n - k + i]; 
        } 
        
        // Copy the first n-k elements to the remaining positions
        int index = 0; 
        for (int i = k; i < n; i++) { 
            ans[i] = nums[index++]; 
        } 
        
        return ans; 
    } 
    
    public static void main(String[] args) { 
        int Array[] = { 1, 2, 3, 4, 5 }; // The input array
        int N = 5; // Size of the array
        int K = 2; // Number of rotations
        
        // Call the rotate function
        int[] ans = rotate(Array, N, K); 
        
        // Print the rotated array
        System.out.print("Rotated Array: ");
        for (int i = 0; i < N; ++i) { 
            System.out.print(ans[i] + " "); 
        } 
    } 
}
