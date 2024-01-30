//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException 
    { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String input_line[] = read.readLine().trim().split("\\s+");
            int n1 = Integer.parseInt(input_line[0]);
            int n2 = Integer.parseInt(input_line[1]);
            int n3 = Integer.parseInt(input_line[2]);
            input_line = read.readLine().trim().split("\\s+");
            String A = input_line[0];
            String B = input_line[1];
            String C = input_line[2];
            Solution obj = new Solution();
            System.out.println(obj.LCSof3(A, B, C, n1, n2, n3));
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    int lcs(String A,String B,String C){
        int dp[][][]=new int[A.length()+1][B.length()+1][C.length()+1];
        for(int i=1;i<=A.length();i++)
        {
            for(int j=1;j<=B.length();j++)
            {
                for(int k=1;k<=C.length();k++)
                {
                if(A.charAt(i-1)==B.charAt(j-1) && C.charAt(k-1)==B.charAt(j-1) && A.charAt(i-1)==C.charAt(k-1))
                dp[i][j][k]=dp[i-1][j-1][k-1]+1;
                else
                dp[i][j][k]=Math.max(dp[i-1][j][k],Math.max(dp[i][j-1][k],dp[i][j][k-1]));
            }
        }
        }
        return dp[A.length()][B.length()][C.length()];
    }
    int LCSof3(String A, String B, String C, int n1, int n2, int n3) 
    { 
        // code here
        return lcs(A,B,C);
    }
}