//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws IOException {
		
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(System.out);
		int t = Integer.parseInt(in.readLine().trim());
        while(t-- > 0)
        {
            int n = Integer.parseInt(in.readLine().trim());
            String s[]=in.readLine().trim().split(" ");
            
            int gallery[] = new int[n];
            for(int i=0; i<n; i++)
                gallery[i] = Integer.parseInt(s[i]);
            Solution T = new Solution();
            out.println(T.min_sprinklers(gallery,n));
        }
		out.close();
		
	}
}





// } Driver Code Ends


//User function Template for Java

class Solution
{
    int min_sprinklers(int hallway[], int n)
    {
        // code here
        for(int i=0;i<n;i++)
         {
             if(hallway[i]==-1) continue;
             int l=Math.max(0,i-hallway[i]);
             int r=i+hallway[i]+1;
             hallway[l]=Math.max(hallway[l],r);
         }
         int re=hallway[0],c=0,j=0;
         for(int i=0;i<n && j<n && i<=j;i++)
         {
             re=Math.max(re,hallway[i]);
             if(i==j)
             {
                 if(re<=i) return -1;
                 c++;
                 j=re;
             }
         }
         return c;
    }
}
