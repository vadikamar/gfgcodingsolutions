//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            String s;
            s = br.readLine();
            
            Solution obj = new Solution();
            String res = obj.encode(s);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static String encode(String s) {
        // code here
        int c = 1;
        StringBuilder ans = new StringBuilder();
        ans.append(s.charAt(0));
        char ch = s.charAt(0);
        
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) != s.charAt(i)) {
                ans.append(c).append(s.charAt(i));
                c = 1;
                ch = s.charAt(i);
            } else {
                c++;
            }
        }
        ans.append(c);
        return ans.toString();
    }
}
    