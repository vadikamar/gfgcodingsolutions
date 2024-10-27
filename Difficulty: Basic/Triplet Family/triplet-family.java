//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
class Solution {
    public boolean findTriplet(int[] arr) {
        int n=arr.length;
         for (int i = 0; i < n; i++) {
            HashSet<Integer> complements = new HashSet<>();
            
            // Iterate through the rest of the elements
            for (int j = 0; j < n; j++) {
                if (i != j) {  // Ensure we don't use the same element
                    int required = arr[i] - arr[j];
                    
                    // Check if the required complement exists
                    if (complements.contains(required)) {
                        return true;
                    }
                    
                    // Add the current element to the set
                    complements.add(arr[j]);
                }
            }
        }
        return false;
    }
}

//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
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
            boolean res = obj.findTriplet(arr);
            if (res)
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
    }
}

// } Driver Code Ends