//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSecondLargest(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends




//User function Template for Java

class Solution {
    int getSecondLargest(int arr[]) {
        // code here
        int m=-1;
        for(int i:arr){
            m=Math.max(m,i);
        }
        int sm=-1;
        for(int i:arr){
            if(i!=m)
            sm=Math.max(sm,i);
        }
        return sm;
    }
}