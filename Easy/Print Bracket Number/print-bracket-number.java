//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            ArrayList<Integer> result = ob.bracketNumbers(S);
            for(int value :  result)
                out.print(value + " ");
            out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    ArrayList<Integer> bracketNumbers(String S) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        int c=0;
        for(int i=0;i<S.length();i++){
            char ch=S.charAt(i);
            if(ch=='('){
                c++;
                st.push(c);
                ans.add(c);
            }
            if(ch==')'){
                ans.add(st.pop());
            }
        }
        return ans;
    }
};