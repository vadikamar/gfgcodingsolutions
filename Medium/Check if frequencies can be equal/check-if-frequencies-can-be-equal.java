//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String input[] = read.readLine().split(" ");
            String a = input[0];
            
            Solution ob = new Solution();
            if(ob.sameFreq(a)){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    boolean sameFreq(String s) {
        // code here
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<26;i++){
            if(freq[i]>0){
                if(mp.containsKey(freq[i]))mp.put(freq[i],mp.get(freq[i])+1);
                else mp.put(freq[i],1);
            }
        }
        if(mp.size()>=3)return false;
        if(mp.size()==1)return true;
        int val1=-1;
        for(int ss:mp.keySet()){
           if(mp.get(ss)==1)val1=ss;
        }
        if(val1==1)return true;
        if(mp.containsKey(val1-1))return true;
        return false;
    }
}