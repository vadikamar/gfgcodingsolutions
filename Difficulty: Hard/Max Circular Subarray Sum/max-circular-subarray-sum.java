//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().circularSubarraySum(arr));
            // System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {

    // a: input array
    // n: size of array
    // Function to find maximum circular subarray sum.
    public int circularSubarraySum(int arr[]) {
        int n = arr.length;
        int maxKadane = kadane(arr);
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = -arr[i];
        }
        int maxInvertedKadane = kadane(arr);
        int circularMax = totalSum + maxInvertedKadane; 
        if (circularMax == 0) 
            return maxKadane;
        return Math.max(maxKadane, circularMax);
    }
    private int kadane(int arr[]) {
        int maxSoFar = arr[0], maxEndingHere = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

}
