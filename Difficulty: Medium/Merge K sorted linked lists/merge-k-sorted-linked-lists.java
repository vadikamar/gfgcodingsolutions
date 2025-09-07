/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node mergeKLists(Node[] arr) {
        // code here
        int K=arr.length;
        ArrayList<Integer> a=new ArrayList<Integer>();
        for(int i=0;i<K;i++)
        {
            Node cur=arr[i];
            while(cur!=null)
            {
                a.add(cur.data);
                cur=cur.next;
            }
        }
        Collections.sort(a);
        Node h=null,newn=new Node(a.get(a.size()-1));
        newn.next=h;
        h=newn;
        for(int i=a.size()-2;i>=0;i--)
        {
            newn=new Node(a.get(i));
            newn.next=h;
            h=newn;
        }
        return newn;
    }
}