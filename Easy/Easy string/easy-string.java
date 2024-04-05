//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String s = read.readLine();
            Solution ob = new Solution();
            String ans = ob.transform(s);
            System.out.println(ans);
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String transform(String str) 
    {
        // code here
        int i=0;
        int j=0;
        str=str.toLowerCase();
        StringBuilder ans=new StringBuilder("");
        while(j<str.length())
        {
            if(str.charAt(i)==str.charAt(j))
            {
                j++;
            }else
            {
               ans.append(j-i);
               ans.append(str.charAt(i));
               i=j;
            }
        }
        ans.append(j-i);
        ans.append(str.charAt(i));
        return ans.toString();
    }
} 