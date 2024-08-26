//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String input = br.readLine();
            String[] inputs = input.split(" ");
            int[] arr = new int[inputs.length];

            for (int i = 0; i < inputs.length; i++) {
                arr[i] = Integer.parseInt(inputs[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.findMaxDiff(arr));
        }
    }
}

// } Driver Code Ends


class Solution {
    public int findMaxDiff(int[] arr) {
        // code here
        int n=arr.length;
        int r[]=new int[n];
        int l[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && st.peek()>=arr[i])
            st.pop();
            l[i]=(st.size()==0)?0:st.peek();
            st.push(arr[i]);
        }
        st.clear();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()>=arr[i])
            st.pop();
            r[i]=(st.size()==0)?0:st.peek();
            st.push(arr[i]);
        }
        int ans=0;
        for(int i=0;i<n;i++)
        ans=Math.max(ans,Math.abs(r[i]-l[i]));
        return ans;
    }
}
