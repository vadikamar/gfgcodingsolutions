//{ Driver Code Starts
import java.util.*;
import java.io.*;

public class GFG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0)
        {
            int n = scanner.nextInt();
            int total = scanner.nextInt();
            int[] cost = new int[n];
            for (int i = 0; i < n; i++) {
                cost[i] = scanner.nextInt();
            }
            Solution solution = new Solution();
            int result = solution.max_courses(n, total, cost);
            System.out.println(result);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution {
    public int max_courses(int n, int total, int[] cost) {
        int[][] dp = new int[n][total + 1];
        for(int[] arr : dp) Arrays.fill(arr, -1);
        return helper(cost, total, 0, dp);
    }
    
    private int helper(int[] arr, int total, int ind, int[][] dp) {
        if(ind == arr.length) return 0;
        if(dp[ind][total] != -1) return dp[ind][total]; 
        int notTake = helper(arr, total, ind + 1, dp);
        int take = 0;
        if(arr[ind] <= total) {
            int redeem = (int) Math.floor(arr[ind] * 0.9);
            take = 1 + helper(arr, total - arr[ind] + redeem, ind + 1, dp);
        }
        return dp[ind][total] = Math.max(notTake, take);
    }
}

