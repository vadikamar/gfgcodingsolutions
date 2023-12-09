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
            int n = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.smithNum(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static boolean isPrime(int n){
        if(n == 1)  return false;
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0)  return false;
            
        }
        return true;
        
    }
    static int smithNum(int n) {
        // code here
        if(isPrime(n)) return 0;
        int t=n,s=0;
        while(t>0)
        {
            int r=t%10;
            s+=r;
            t/=10;
        }
        int f=0;
        int x=n,i=2;
        while(x!=1)
        {
            if(x%i==0)
            {
                if(i>9)
                {
                    int j=i;
                    while(j>0)
                    {
                        f+=j%10;
                        j/=10;
                    }
                }
                else
                f+=i;
                x=x/i;
            }
            else
            i++;
        }
        return (s==f)?1:0;
    }
};