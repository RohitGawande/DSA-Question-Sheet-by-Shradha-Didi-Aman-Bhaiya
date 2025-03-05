/*For hiring a car, a travel agency charges R1 rupees per hour for the first N hours and then R2 rupees per hour.  
Given the total time of travel in minutes in X. 
The task is to find the total travelling cost in rupees. 
Note : While converting minutes into hours, ceiling value should be considered as the total number of hours. 
For example : If the total travelling time is 90 minutes, i.e. 1.5 hours, it must be considered as 2 hours. 
Example : 
Input : 
20 -- r1 
4 -- n 
40 -- r2 
300 -- x 
Output : 
120 
Explanation :
Total travelling hours = 300 / 60 = 5 hours 
Rupees 20 / hours for first 4 hours = 20 * 4 = 80 rupees 
Rupees 40 / hours in 5th hour = 40 * 1 = 40 rupees 
Hence, the total travelling cost = 80 + 40 = 120 rupees */

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs
        System.out.println("Enter rate for first N hours (R1): ");
        int R1 = sc.nextInt();

        System.out.println("Enter number of first hours (N): ");
        int N = sc.nextInt();

        System.out.println("Enter rate after N hours (R2): ");
        int R2 = sc.nextInt();

        System.out.println("Enter total travel time in minutes (X): ");
        int X = sc.nextInt();

        // Convert minutes to hours (ceiling division)
        int hours = (X + 59) / 60;

        // Calculate total cost
        int totalCost = 0;
        if (hours <= N) {
            totalCost = R1 * hours; // Calculate for hours if less than N
        } else {
            totalCost = (R1 * N) + (R2 * (hours - N));
        }

        // Output total cost
        System.out.println("Total Cost is: " + totalCost + " Rs");

        sc.close();
    }
}


