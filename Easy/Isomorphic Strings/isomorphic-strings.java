//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.*;


public class Driver {
    
    public static void main(String[] args)throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0)
        {
            String s1 = br.readLine();
            String s2 = br.readLine();
            
            Solution obj = new Solution();
            
            boolean a = obj.areIsomorphic(s1,s2);
            if(a)
            System.out.println(1);
            else
            System.out.println(0);
        }
    }
    
}

// } Driver Code Ends



class Solution
{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1,String str2)
    {
        // Your code here
        if(str1.length()!=str2.length()) return false;
        HashMap<Character,Character> h1=new HashMap<>();
        HashMap<Character,Boolean> h2=new HashMap<>();
        for(int i=0;i<str1.length();i++){
            char c1=str1.charAt(i);
            char c2=str2.charAt(i);
            if(h1.containsKey(c1)){
                if(h1.get(c1)!=c2) return false;
            }
            else{
                if(h2.containsKey(c2)) return false;
                else{
                    h1.put(c1,c2);
                    h2.put(c2,true);
                }
            }
        }
        return true;
    }
}