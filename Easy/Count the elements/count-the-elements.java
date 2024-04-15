//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		// looping through all testcases
		while(testcases-- > 0){
		    int n=Integer.parseInt(br.readLine());
		    String line1 = br.readLine();
		    String line2 = br.readLine();
		    String[] a1 = line1.trim().split("\\s+");
		    String[] b1 = line2.trim().split("\\s+");
		    int a[]=new int[n];
		    int b[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=Integer.parseInt(a1[i]);
		        b[i]=Integer.parseInt(b1[i]);
		    }
		    int q = Integer.parseInt(br.readLine());
		    int query[]=new int[q];
		    for(int i=0;i<q;i++)
		    {
		        query[i]=Integer.parseInt(br.readLine());
		    }
		    Solution ob=new Solution();
		    int ans[]=ob.countElements(a,b,n,query,q);
		    for(int i=0;i<q;i++)
		    System.out.println(ans[i]);
		    
		}
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    public static int[] countElements(int a[], int b[], int n, int query[], int q)
    {
        Arrays.sort(b);
        int ans[]=new int[q];
        for(int i=0;i<q;i++){
            int y=a[query[i]];
            /*int l=0,u=n-1;
            while(l<u){
                int mid=(l+u)/2;
                if(b[mid]==y){
                    ans[i]=mid+1;
                    break;
                }
                else if(mid>0 && b[mid]>y && b[mid-1]<=y){
                    ans[i]=mid;
                    break;
                }
                else if(mid<n-1 && b[mid]<=y && b[mid+1]>y){
                    ans[i]=mid+1;
                    break;
                }
                else if(b[mid]<y)
                l=mid+1;
                else
                u=mid-1;
            }
            if(ans[i]==0 && y>b[n-1])
            ans[i]=n;*/
            int c=0;
            for(int j=0;j<n;j++){
                if(b[j]<=y) c++;
            }
            ans[i]=c;
        }
        return ans;
    }
}
