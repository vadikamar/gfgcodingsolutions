//{ Driver Code Starts
import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().maxProduct(arr, n));
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
        long prefix = 1;
        long suffix = 1;
        long max = Long.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            prefix *= arr[i];
            suffix *= arr[n - i - 1];

            max = Math.max(max, Math.max(prefix, suffix));

            // Reset to 1 only if the current element is 0
            if (arr[i] == 0) {
                prefix = 1;
            }
            if (arr[n - i - 1] == 0) {
                suffix = 1;
            }
        }
        return max;
    }
}