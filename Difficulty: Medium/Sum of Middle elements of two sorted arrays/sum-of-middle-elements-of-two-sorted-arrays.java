//{ Driver Code Starts
// Initial Template for Java

import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {
    public int SumofMiddleElements(int[] ar1, int[] ar2) {
        // code here
        int n=ar1.length;
        int i=n-1;
        int j=0;
        while(i>=0 && j<n)
        {
            if(ar1[i]>ar2[j])
            {
                int t=ar1[i];
                ar1[i]=ar2[j];
                ar2[j]=t;
            }
            i--;
            j++;
        }
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        return ar1[n-1]+ar2[0];
    }
}

//{ Driver Code Starts.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume newline
        while (t-- > 0) {
            String[] input1 = sc.nextLine().split(" ");
            int[] arr = new int[input1.length];
            for (int i = 0; i < input1.length; i++) {
                arr[i] = Integer.parseInt(input1[i]);
            }

            String[] input2 = sc.nextLine().split(" ");
            int[] brr = new int[input2.length];
            for (int i = 0; i < input2.length; i++) {
                brr[i] = Integer.parseInt(input2[i]);
            }

            Solution ob = new Solution();
            int res = ob.SumofMiddleElements(arr, brr);
            System.out.println(res);
        }
    }
}

// } Driver Code Ends