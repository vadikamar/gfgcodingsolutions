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

class Main {
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String[] input1 = br.readLine().trim().split("\\s+");
            if (input1.length < 2) {
                System.out.println(-1);
                continue;
            }
            int a = Integer.parseInt(input1[0]);
            int b = Integer.parseInt(input1[1]);

            String[] input2 = br.readLine().trim().split("\\s+");
            if (input2.length == 0) {
                System.out.println(-1);
                continue;
            }

            Node head = new Node(Integer.parseInt(input2[0]));
            Node tail = head;
            for (int i = 1; i < input2.length; i++) {
                tail.next = new Node(Integer.parseInt(input2[i]));
                tail = tail.next;
            }

            Solution ob = new Solution();
            Node newHead = ob.reverseBetween(a, b, head);
            printList(newHead);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    */
class Solution {
    public static Node reverseBetween(int a, int b, Node head) {
        // code here
        int i=1;
        Node ans=new Node(0),h=ans;
        Node cur=head;
        while(cur!=null){
            if(i<a){
                h.next=new Node(cur.data);
                h=h.next;
            }
            else
            break;
            cur=cur.next;
            i++;
        }
        Stack<Integer> m=new Stack<>();
        while(cur!=null){
            if(i<=b)
            m.push(cur.data);
            else
            break;
            cur=cur.next;
            i++;
        }
        while(!m.isEmpty()){
            h.next=new Node(m.pop());
            h=h.next;
        }
        while(cur!=null){
            h.next=new Node(cur.data);
            h=h.next;
            cur=cur.next;
        }
        return ans.next;
    }
}