//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            String s1 = sc.next();
            String s2 = sc.next();
            Solution obj = new Solution();
            int[] ans=obj.longestCommonPrefix(s1,s2);
            if(ans[0] == -1)
                System.out.println(ans[0]);
            else 
                System.out.println(ans[0]+" "+ans[1]);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    public int[] longestCommonPrefix(String s1, String s2){
        //code here
        int j=0;
        int m=s2.length();
        int ans[]={-1,-1};
        for(int i=0;i<m;i++)
        {
            if(s1.charAt(j)==s2.charAt(i)){
                ans[1]=Math.max(ans[1],j);
                j++;
            }
            else{
                j=0;
                if(s1.charAt(j)==s2.charAt(i)){
                    ans[1]=Math.max(ans[1],j);
                    j++;
                }
            }
        }
        if(ans[1]>-1)
        ans[0]=0;
        return ans;
    }
}