//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // Number of test cases

        while (t-- > 0) {
            String[] input = br.readLine().split(" ");
            long[] a = new long[input.length];

            for (int i = 0; i < input.length; i++) {
                a[i] = Long.parseLong(input[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.minCost(a));
        }
    }
}

// } Driver Code Ends




class Solution
{
    //Function to return the minimum cost of connecting the ropes.
    long minCost(long arr[]) 
    {
        // your code here
        int n=arr.length;
        PriorityQueue<Long> a= new PriorityQueue<Long>();
        for(long i:arr)
        a.add(i);
        long ts=0;
        long s=a.poll();
        while(!a.isEmpty())
        {
            s+=a.poll();
            ts+=s;
            a.add(s);
            s=a.poll();
        }
        return ts;
    }
}