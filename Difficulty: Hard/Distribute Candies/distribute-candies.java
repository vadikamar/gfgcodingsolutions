/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    int moves;
    int solve(Node root) 
    {
        if(root == null)
            return 0;

        int ln = solve(root.left);
        int rn = solve(root.right);

        moves += Math.abs(ln) + Math.abs(rn);
        return root.data - 1 + ln + rn;
    }

    public int distCandy(Node root) {
        // code here
        moves = 0;
        solve(root);
        return moves;
    }
}