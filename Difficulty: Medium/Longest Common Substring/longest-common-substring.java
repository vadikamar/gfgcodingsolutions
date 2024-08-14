//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S1 = read.readLine().trim();
            String S2 = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestCommonSubstr(S1, S2));
        }
    }
}
// } Driver Code Ends




//User function Template for Java

class Solution{
    int longestCommonSubstr(String S1, String S2){
        int n=S1.length(),m=S2.length();
        int[][] dp=new int[n+1][m+1];
        
        int lcs=0;
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(S1.charAt(i-1)==S2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                    lcs=Math.max(lcs,dp[i][j]);
                }
                else dp[i][j]=0;
            }
        }
        return lcs;
    }
}