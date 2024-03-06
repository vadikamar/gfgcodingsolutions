//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s, patt;
            s = sc.next();
            patt = sc.next();
            
            Solution ob = new Solution();
            
            ArrayList<Integer> res = ob.search(patt, s);
            
            for(int i = 0;i<res.size();i++)
                System.out.print(res.get(i) + " ");
            System.out.println();    
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    ArrayList<Integer> search(String pattern, String text)
    {
        // your code here
        ArrayList<Integer> ans=new ArrayList<Integer>();
        /*int p=0;
        for(int j=0;j<pattern.length();j++){
                p=10*p+pattern.charAt(j)-'a';
            }
        int hit=p%text.length();
        for(int i=0;i<text.length()-pattern.length();i++){
            int s=0;
            for(int j=i;j-i<pattern.length();j++){
                s=10*s+text.charAt(j)-'a';
            }
            int f=1;
            if(hit==s%text.length()){
                for(int j=i;j-i<pattern.length();j++){
                if(text.charAt(j)!=pattern.charAt(j-i)){
                    f=0;
                continue;
                }
            }
            if(f==1) 
            ans.add(i+1);
            }
            else
            continue;
        }*/
        int i=text.indexOf(pattern);
        while(i!=-1)
        {
            ans.add(i+1);
            i=text.indexOf(pattern,i+1);
        }
        return ans;
    }
}