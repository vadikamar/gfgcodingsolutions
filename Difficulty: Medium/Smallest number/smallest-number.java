//{ Driver Code Starts
import java.util.*;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int s = sc.nextInt();
            int d = sc.nextInt();

            Solution obj = new Solution();
            String res = obj.smallestNumber(s, d);

            System.out.println(res);
        }
    }
}
// } Driver Code Ends



class Solution {
    public String smallestNumber(int s, int d) {
        // code here
        String ans="-1";
        for(int i=(int)Math.pow(10,d-1);i<(int)Math.pow(10,d);i++){
            int sum=0,x=i;
            while(x!=0){
                int r=x%10;
                sum+=r;
                x=x/10;
            }
            if(sum==s){
            ans=String.valueOf(i);
            break;}
        }
        return ans;
    }
}
