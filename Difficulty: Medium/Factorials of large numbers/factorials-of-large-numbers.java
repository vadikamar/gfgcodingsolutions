//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java
import java.math.BigInteger;
class Solution {
    static ArrayList<Integer> factorial(int N) {
        // code here
       ArrayList<Integer> res=new ArrayList<>();
       BigInteger ans=BigInteger.ONE;
       
       for(int i=2;i<=N;i++)
       {
           ans=ans.multiply(BigInteger.valueOf(i));
       }
       
       
       String s=ans.toString();
       for(char i:s.toCharArray())
           res.add(i-'0');
    return res;
    }
}

//{ Driver Code Starts.

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.factorial(N);
            for (Integer val : ans) System.out.print(val);
            System.out.println();
        }
    }
}
// } Driver Code Ends