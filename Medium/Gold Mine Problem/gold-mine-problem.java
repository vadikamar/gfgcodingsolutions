//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String inline[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(inline[0]);
            int m = Integer.parseInt(inline[1]);
            String inline1[] = in.readLine().trim().split("\\s+");
            int M[][] = new int[n][m];
            for(int i = 0;i < n*m;i++){
                M[i/m][i%m] = Integer.parseInt(inline1[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.maxGold(n, m, M));
        }
    }
} 
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int rec(int i,int j,int n,int m,int mat[][],int dp[][]){
        if(i<0 || i==n || j==m) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int ur=rec(i-1,j+1,n,m,mat,dp);
        int r=rec(i,j+1,n,m,mat,dp);
        int dr=rec(i+1,j+1,n,m,mat,dp);
        return dp[i][j]=mat[i][j]+Math.max(ur,Math.max(r,dr));
    }
    static int maxGold(int n, int m, int M[][])
    {
        // code here
        int dp[][]=new int[n][m],ans=0;
        for(int[] a:dp) Arrays.fill(a,-1);
        for(int i=0;i<n;i++) ans=Math.max(ans,rec(i,0,n,m,M,dp));
        return ans;
    }
}