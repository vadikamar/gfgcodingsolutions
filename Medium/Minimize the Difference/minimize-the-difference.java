//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            int k;
            k = Integer.parseInt(br.readLine());
            
            
            int[] arr = IntArray.input(br, n);
            
            Solution obj = new Solution();
            int res = obj.minimizeDifference(n, k, arr);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends



class Solution {
    public static int minimizeDifference(int n, int k, int[] arr) {
        // code here
        int[] suffMin = new int[n];
        int[] suffMax = new int[n];

        suffMin[n - 1] = arr[n - 1];
        suffMax[n - 1] = arr[n - 1];

        //Calculate suffix min Max array
        for (int i = arr.length - 2; i >= 0; i--) {
            suffMin[i] = Math.min(suffMin[i + 1], arr[i]);
            suffMax[i] = Math.max(suffMax[i + 1], arr[i]);
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int minDiff = Integer.MAX_VALUE;

        //intution
        for (int i = 0, j = k - 1; i < n && j < n; i++, j++) {
            int diff = Integer.MAX_VALUE;
            if (j < n - 1) {
                diff = Math.abs((Math.max(suffMax[j + 1], max)) - (Math.min(suffMin[j + 1], min)));
            }
            else {
                diff = Math.abs(max - min);
            }

            minDiff = Math.min(diff, minDiff);

            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }

        return minDiff;
    }
}
        
