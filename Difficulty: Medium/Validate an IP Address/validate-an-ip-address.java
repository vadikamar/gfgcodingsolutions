//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.io.*;
import java.util.*;

public class validip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();

            if (obj.isValid(s))
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
}
// } Driver Code Ends




// User function Template for Java

class Solution {

    public boolean isValid(String S) {
        // Write your code here
        String n="";
        int c=0;
        for(int i=0;i<S.length();i++)
        {
            if(!Character.isDigit(S.charAt(i)) && S.charAt(i)!='.')
            return false;
            if(S.charAt(i)=='.')
            {
                c++;
                if(n.equals("")||(n.startsWith("0")&&!n.equals("0")))
                return false;
                int no = Integer.parseInt(n);
                if(no<0 || no>255)
                return false;
                n="";
            }
            else if(n.startsWith("0")&&(!n.equals("0")))
            return false;
            else if(i==S.length()-1)
            {
               n+=S.charAt(i);
               if(n.equals("") || (n.startsWith("0")&&!n.equals("0")))
               return false;
               int no = Integer.parseInt(n);
               if(no<0 || no>255)
               return false;
            }
            else{
            n+=S.charAt(i);
            if(n.equals(""))
            return false;
            }
        }
        if(c==3)
        return true;
        else
        return false;
    }
}