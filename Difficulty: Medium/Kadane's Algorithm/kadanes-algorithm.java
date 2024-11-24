//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            Solution obj = new Solution();

            // calling maxSubarraySum() function
            System.out.println(obj.maxSubarraySum(arr));
        }
    }
}

// } Driver Code Ends







class Solution{
    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[]){
        int n=arr.length;
        int max = arr[0];  
        for (int i = 0; i < arr.length; i++) 
        {  
           if(arr[i] > max)  
               max = arr[i];  
        }  
        if(max<0)
        return max;
        int b=0;
        max=0;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
            sum=Math.max(sum,0);
            max=Math.max(max,sum);
        }
        return max;
        
    }
    
}

