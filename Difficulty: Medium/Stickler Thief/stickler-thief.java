//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String inputLine[] = br.readLine().trim().split(" ");
            int n = inputLine.length;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            // calling method findMaxSum() of class solve
            System.out.println(new Solution().findMaxSum(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends




class Solution
{
    //Function to find the maximum money the thief can get.
    public int findMaxSum(int arr[])
    {
        // Your code here
        int n=arr.length;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        if(n==1)
        return arr[0];
        dp[1]=arr[0];
        for(int i=2;i<=n;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+arr[i-1]);
        }
        return dp[n];
    }
}