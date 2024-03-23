//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            int ans[] = obj.Series(n);
            for (int i : ans) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {

    int[] Series(int n) {
        // code here
        if(n==1) return new int[]{0,1};
        else if(n==2) return new int[]{0,1,1};
        int ans[]=new int[n+1];
        int m=(int)Math.pow(10,9)+7;
        int a=0,b=1,c=a+b;
        ans[0]=a;
        ans[1]=b;
        for(int i=2;i<=n;i++){
            c=(a+b)%m;
            ans[i]=c%m;
            a=b%m;
            b=c%m;
        }
        return ans;
    }
}