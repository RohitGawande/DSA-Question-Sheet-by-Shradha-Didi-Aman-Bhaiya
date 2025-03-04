import java.util.Scanner;

public class Solution {

    // Recursive function to count valid arrangements
    static int countArrangements(int R, int G, int T, char last) {
        // Base case: if all counts are zero, a valid arrangement is found
        if (R == 0 && G == 0 && T == 0) {
            return 1;
        }

        int count = 0;

        // If Ruby (R) is still available and last placed was not R
        if (R > 0 && last != 'R') {
            count += countArrangements(R - 1, G, T, 'R');
        }

        // If Garnet (G) is still available and last placed was not G
        if (G > 0 && last != 'G') {
            count += countArrangements(R, G - 1, T, 'G');
        }

        // If Topaz (T) is still available and last placed was not T
        if (T > 0 && last != 'T') {
            count += countArrangements(R, G, T - 1, 'T');
        }

        return count; // total valid arrangements from this point
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for counts of R, G, and T
        int R = sc.nextInt(); // count of Ruby
        int G = sc.nextInt(); // count of Garnet
        int T = sc.nextInt(); // count of Topaz

        // Initial call with no gemstone placed yet (' ' as last)
        int result = countArrangements(R, G, T, ' ');

        // Output total valid arrangements
        System.out.println(result);
    }
}
