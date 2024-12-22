//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class gfg {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int mat[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) mat[i][j] = sc.nextInt();
            }

            int x = sc.nextInt();

            if (new Solution().matSearch(mat, x))
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public static boolean matSearch(int mat[][], int x) {
        // your code here
        List<Integer> row=new ArrayList<>();
        for(int i=0;i<mat.length;i++){
            int a=mat[i][0];
            int b=mat[i][mat[0].length-1];
            if(a==x || b==x) return true;
            if(a<=x && b>=x)
            {
                row.add(i);
                continue;
            }
        }
        if(row.size()==0) return false;
        for(int j:row){
        for(int i=0;i<mat[0].length;i++){
            if(mat[j][i]==x) return true;
        }}
        return false;
    }
}