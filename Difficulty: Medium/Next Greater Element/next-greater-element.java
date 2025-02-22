//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // Number of test cases
        for (int g = 0; g < t; g++) {
            String[] str =
                (br.readLine()).trim().split(" "); // Reading input as a string array
            int arr[] = new int[str.length]; // Creating integer array from the input
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }

            // Getting the result from the Solution class
            ArrayList<Integer> result = new Solution().nextLargerElement(arr);

            // Printing the result in the required format
            if (result.isEmpty()) {
                System.out.println("[]");
            } else {
                for (int i = 0; i < result.size(); i++) {
                    if (i != 0) System.out.print(" ");
                    System.out.print(result.get(i));
                }
                System.out.println();
                System.out.println("~");
            }
        }
    }
}

// } Driver Code Ends




class Solution
{
    //Function to find the next greater element for each element of the array.
    public static ArrayList<Integer> nextLargerElement(int[] arr)
    { 
        // Your code here
        int n=arr.length;
        Stack<Integer> x=new Stack<>();
        x.push(-1);
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=n-1;i>=0;i--)
        {
            while(x.peek()!=-1 && x.peek()<=arr[i])
            x.pop();
            ans.add(x.peek());
            x.push(arr[i]);
        }
        Collections.reverse(ans);
        return ans;
    } 
}