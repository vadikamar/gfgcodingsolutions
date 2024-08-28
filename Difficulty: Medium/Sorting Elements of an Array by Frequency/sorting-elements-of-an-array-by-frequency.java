//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.Map.Entry;


// } Driver Code Ends
// User function Template for Java

class Solution {
    // Function to sort the array according to frequency of elements.
    public ArrayList<Integer> sortByFreq(int arr[]) {
        // add your code here
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:arr){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->{
            if(hm.get(a)==hm.get(b))return a-b;
            return hm.get(b)-hm.get(a);
        });
        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            pq.add(entry.getKey());
        }
        ArrayList<Integer> ans=new ArrayList<>();
        while(!pq.isEmpty()){
            int p=pq.poll();
            int n=hm.get(p);
            while(n-->0){
              ans.add(p);  
            }
        }
        return ans;
    }
}

//{ Driver Code Starts.

class Driverclass {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        while (n != 0) {
            String input = sc.readLine();
            String[] inputs = input.split(" ");
            int[] arr = new int[inputs.length];

            for (int i = 0; i < inputs.length; i++) {
                arr[i] = Integer.parseInt(inputs[i]);
            }

            ArrayList<Integer> ans = new ArrayList<Integer>();
            ans = new Solution().sortByFreq(arr);
            for (int i = 0; i < ans.size(); i++) System.out.print(ans.get(i) + " ");
            System.out.println();
            n--;
        }
    }
}

// } Driver Code Ends