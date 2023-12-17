//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findMaxSum(arr, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int solve(int arr[],int i,int dp[]){
        if(i<0)
        return 0;
        if(i==0)
        return arr[0];
        if(dp[i]!=-1)
        return dp[i];
        int a=solve(arr,i-2,dp)+arr[i];
        int b=solve(arr,i-1,dp);
        int ans=Math.max(a,b);
        dp[i]=ans;
        return dp[i];
    }
    int findMaxSum(int arr[], int n) {
        // code here
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return solve(arr,n-1,dp);
    }
}