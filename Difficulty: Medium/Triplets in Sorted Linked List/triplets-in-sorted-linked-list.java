//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class LinkedList {
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            ArrayList<Integer> arr = new ArrayList<>();
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            while (st.hasMoreTokens()) {
                arr.add(Integer.parseInt(st.nextToken()));
            }
            int k = Integer.parseInt(br.readLine());
            Node head = new Node(arr.get(0));
            Node tail = head;
            for (int i = 1; i < arr.size(); ++i) {
                tail.next = new Node(arr.get(i));
                tail = tail.next;
            }
            Solution ob = new Solution();
            int res = ob.countTriplets(head, k);
            System.out.println(res);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int countTriplets(Node head, int x) {
        // code here.
        ArrayList<Integer> array = new ArrayList<>() ;
        
        Node temp = head ;
        while(temp!=null){
            array.add(temp.data) ;
            temp = temp.next ;
    } 
       Collections.sort(array) ;
       
       int count = 0 ;
       int n = array.size() ;
       
      for(int i=0;i<n-2;i++){
       int left = i+1 ;
       int right = n-1 ;
       
       while(left<right){
           int sum = array.get(i) + array.get(left) + array.get(right) ;
           if(sum==x){
               count++ ;
               left++ ;
               right-- ;
           }
           else if(sum>x){
               right-- ;
           }
           else {
               left++ ;
           }
       }
      }
      return count ;
    }
}