//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Solution ob = new Solution();
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String input_line[] = read.readLine().trim().split("\\s+");
            int n = Integer.parseInt(input_line[0]);
            String input_line1[] = read.readLine().trim().split("\\s+");
            int[][] a = new int[n][n];
            int c = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = Integer.parseInt(input_line1[c]);
                    c++;
                }
            }
            String ans = ob.pattern(a);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public String pattern(int[][] arr) {
        // Code here
        String ans="";
        int n=arr.length,m=arr[0].length,cc=0,rc=0,minr=n,minc=m;
        for(int i=0;i<n;i++)
        {
            int f=0;
            for(int j=0;j<m/2;j++){
                if(arr[i][j]!=arr[i][m-j-1]){
                    f=1;
                    break;
                }
            }
            if(f==0){
            rc++;
            minr=Math.min(minr,i);
            }
        }
        for(int i=0;i<m;i++)
        {
            int f=0;
            for(int j=0;j<n/2;j++){
                if(arr[j][i]!=arr[n-j-1][i]){
                    f=1;
                    break;
                }
            }
            if(f==0){
            cc++;
            minc=Math.min(minc,i);
            }
        }
        if(rc!=0)
        ans+=String.valueOf(minr)+" R";
        else{
        if(cc!=0)
        ans+=String.valueOf(minc)+" C";
        else
        ans+="-1";
        }
        return ans;
    }
}
