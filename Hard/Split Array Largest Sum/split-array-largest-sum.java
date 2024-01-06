//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String St[] = read.readLine().split(" ");
            
            int N = Integer.parseInt(St[0]);
            int K = Integer.parseInt(St[1]);
            
            String S[] = read.readLine().split(" ");
            
            int[] arr = new int[N];
            
            for(int i=0 ; i<N ; i++)
                arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.splitArray(arr,N,K));
        }
    }
}
// } Driver Code Ends


class Solution 
{
    public static boolean isvalid(int[] A,int N,int M,int mid)
    {
        int st=1;
        int sum=0;
        for(int i=0;i<N;i++)
        {
            sum+=A[i];
            if(sum>mid)
            {
                st++;
                sum=A[i];
            }
            if(M<st)
            {
                return false;
            }
        }
        return true;
    }
    public static int splitArray(int[]A,int N,int M)
    {
        //Your code here
        if(N<M)
        {
            return -1;
        }
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<N;i++)
        {
            max=Math.max(max,A[i]);
            sum+=A[i];
        }
        if(N==1){
            return sum;
        }
        int start=max;
        int end=sum;
        int res=-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(isvalid(A,N,M,mid)==true)
            {
                res=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return res;
    }

};