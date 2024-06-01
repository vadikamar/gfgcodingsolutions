//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String s;
            s = br.readLine();

            Solution obj = new Solution();
            String res = obj.oddEven(s);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends



class Solution {
    public static String oddEven(String s) {
        // code here
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<s.length();i++)
        h.put(s.charAt(i),h.getOrDefault(s.charAt(i),0)+1);
        int even=0,odd=0;
        for(char i:h.keySet())
        {
            if(((int)i-96)%2==0 && h.get(i)%2==0){
            even++;
            }
            else if(((int)i-96)%2!=0 && h.get(i)%2!=0){
            odd++;
            }
        }
        return ((odd+even)%2==0)?"EVEN":"ODD";
    }
}
