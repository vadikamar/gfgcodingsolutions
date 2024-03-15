//{ Driver Code Starts
import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}

class GFG{
	static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
	
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            
            Solution g = new Solution();
            printList(g.zigZag(head));
        }
    } 
}

// } Driver Code Ends


/*Node is as follows:

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
	public static Node zigZag(Node head){
        //add code here.
        Node ans=new Node(0),h=ans;
        Node cur=head;
        ArrayList<Integer> a=new ArrayList<>();
        while(cur!=null){
            a.add(cur.data);
            cur=cur.next;
        }
        for(int i=0;i<a.size()-1;i++){
            if(i%2==0 && a.get(i)>a.get(i+1))
            {
                int t=a.get(i);
                a.set(i,a.get(i+1));
                a.set(i+1,t);
            }
            if(i%2!=0 && a.get(i)<a.get(i+1))
            {
                int t=a.get(i);
                a.set(i,a.get(i+1));
                a.set(i+1,t);
            }
        }
        for(int i=0;i<a.size();i++){
            h.next=new Node(a.get(i));
            h=h.next;
        }
        return ans.next;
    }
}