//{ Driver Code Starts
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class Main {
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void addressStore(Node[] arr, Node head) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            arr[i] = temp;
            i++;
            temp = temp.next;
        }
    }

    public static boolean check(Node[] before, Node[] after, int num, int k) {
        if (k > num) return true;

        for (int i = 0; i < num; i++) {
            if ((i == k - 1) || (i == num - k)) {
                if (!((before[k - 1] == after[num - k]) &&
                      (before[num - k] == after[k - 1]))) {
                    return false;
                }
            } else {
                if (before[i] != after[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        // sc.nextLine(); // Consume the newline

        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input = sc.nextLine();
            Scanner ss = new Scanner(input);

            // Read numbers from the input line
            while (ss.hasNextInt()) {
                arr.add(ss.nextInt());
            }

            int k = sc.nextInt();
            sc.nextLine(); // Consume the newline

            Node head = null;

            // Check if the array is empty
            if (!arr.isEmpty()) {
                head = new Node(arr.get(0));
                Node tail = head;
                for (int i = 1; i < arr.size(); ++i) {
                    tail.next = new Node(arr.get(i));
                    tail = tail.next;
                }
            }

            int num = arr.size();
            Node[] before = new Node[num];
            addressStore(before, head);

            Solution ob = new Solution();
            head = ob.swapKthNode(head, k);

            Node[] after = new Node[num];
            addressStore(after, head);

            if (check(before, after, num, k))
                System.out.println("true");
            else
                System.out.println("false");
        }

        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public Node swapKthNode(Node head, int K) {
        // code here
        int num=0;
        Node cur=head;
        while(cur!=null){
        num++;
        cur=cur.next;
        }
         if (num < K) return head;
        int cnt1 = K, cnt2 = num - K + 1;
        Node curr = head;
        Node prev = null;
        Node node1 = null;
        Node node2 = null;
        Node node1Next = null;
        Node node2Prev = null;
        Node node1Prev = null;
        Node node2Next = null;
        while (curr != null && (cnt1 > 0 || cnt2 > 0)) {
            cnt1--;
            cnt2--;
            if (cnt1 == 0 && node1 == null) {
                if (prev != null) node1Prev = prev;
                node1 = curr;
                if (curr.next != null) node1Next = curr.next;
            }
            if (cnt2 == 0 && node2 == null) {
                if (prev != null) node2Prev = prev;
                node2 = curr;
                if (curr.next != null) node2Next = curr.next;
            }
            prev = curr;
            curr = curr.next;
        }
        if (node1Prev != null && node1Prev != node2) node1Prev.next = node2;
        if (node2Prev != null && node2Prev != node1) node2Prev.next = node1;
        if (node1 != node2Next) node1.next = node2Next;
        else node1.next = node2;
        if (node2 != node1Next) node2.next = node1Next;
        else node2.next = node1;
        if (node1 == head) head = node2;
        else if (node2 == head) head = node1;
        return head;
    }
}