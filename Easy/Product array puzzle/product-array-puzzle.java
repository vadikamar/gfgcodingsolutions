//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
        	int[] array = new int[n];
        	for (int i=0; i<n ; i++ ) {
        		array[i] = sc.nextInt();
        	}
            Solution ob = new Solution();
            long[] ans = new long[n];
            ans = ob.productExceptSelf(array, n); 

           	for (int i = 0; i < n; i++) { 
				System.out.print(ans[i]+" ");
			} 
            System.out.println();
            t--;
        }
    } 
} 
  


// } Driver Code Ends


//User function Template for Java


class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        // code here
        long ans[]=new long[n];
        Integer a[]=new Integer[n];
        for(int i=0;i<n;i++) a[i]=nums[i];
        if(Arrays.asList(a).contains(0))
        {
            long p=1,zc=0;
            for(int i:nums)
            {
               if(i==0) zc++;
               else
               p*=i;
            }
            if(zc==1)
            {
               for(int i=0;i<n;i++)
               {
                   if(nums[i]==0)
                   ans[i]=p;
               }
            }
        }
        else
        {
            long p=1;
            for(int i:nums)
            p*=i;
            for(int i=0;i<n;i++)
            ans[i]=p/nums[i];
        }
        return ans;
	} 
} 
