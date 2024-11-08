//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String A = read.readLine();
            String B = read.readLine();

            Solution ob = new Solution();
            out.println(ob.minRepeats(A, B));
        }
        out.close();
    }
}
// } Driver Code Ends




//User function Template for Java

class Solution {
    static int minRepeats(String s1, String s2) {
        // code here
        int m=s2.length();
        int lps[]=new int[m];
        int f=0;
        int s=1;
        while(s<m){
            if(s2.charAt(f)==s2.charAt(s)){
                lps[s++]=f+++1;
            }else{
                if(f==0){
                    lps[s]=0;
                    s++;
                }else{
                    f=lps[f-1];
                }
            }
        }
        
        StringBuilder sb=new StringBuilder(s1);
        int lenS1=s1.length();
        int lenS2=m;
        int lenS=sb.length();
        f=0;
        s=0;
        int count=1;
        while(true){
            while(lenS<lenS2){
                sb.append(s1);
                lenS+=lenS1;
                count++;
            }
            
            // kmp for string matching
            while(f<lenS){
                if(sb.charAt(f)==s2.charAt(s)){
                    f++;
                    s++;
                    if(s==lenS2){
                        return count;
                    }
                }else{
                    if(s==0){
                        f++;
                    }else{
                        s=lps[s-1];
                    }
                }
            }
            if(lenS<2*lenS2){
                count++;
                sb.append(s1);
                lenS+=lenS1;
            }else{
                break;
            }
            
        }
        
        return -1;
    }
};