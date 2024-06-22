//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.regex.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.ExtractNumber(S));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    long ExtractNumber(String sentence) {
        // code here
        long ans=0;
        long cnum=0;
        for(int i=0;i<sentence.length();i++){
            char ch=sentence.charAt(i);
            if(Character.isDigit(ch))
            {
                if(ch-'0'!=9)
                cnum=10*cnum+ch-'0';
                else
                cnum=0;
            }
            else
            {
                ans=Math.max(cnum,ans);
                cnum=0;
            }
        }
        return ans!=0?ans:-1;
    }
}