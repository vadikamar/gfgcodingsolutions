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
            int n = sc.nextInt();
            String arr[] = new String[n];
            for(int i = 0;i<n;i++)
                arr[i] = sc.next();
            
            Solution ob = new Solution();
            
            System.out.println(ob.secFrequent(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String secFrequent(String arr[], int N)
    {
        // your code here
        HashMap<String,Integer> h=new HashMap<>();
        for(String i:arr)
        h.put(i,h.getOrDefault(i,0)+1);
        //System.out.println(h);
        int m=-1;
        for(String i:h.keySet()){
            m=Math.max(m,h.get(i));
        }
        int sm=-1;
        String ans="";
        for(String i:h.keySet()){
            if(h.get(i)!=m){
            if(sm<h.get(i)){
                sm=h.get(i);
                ans=i;}
            }
        }
        //System.out.println(m+" "+sm);
        return ans;
    }
}