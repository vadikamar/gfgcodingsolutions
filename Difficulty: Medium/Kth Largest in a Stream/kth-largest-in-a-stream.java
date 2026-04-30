class Solution {
    static ArrayList<Integer> kthLargest(int[] arr, int k) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        int n=arr.length;
        PriorityQueue<Integer> a=new PriorityQueue<Integer>();
        for(int i=0;i<n;i++){
        a.add(arr[i]);
        if(a.size()<k)
        ans.add(-1);
        else {
        if(a.size()>k)
        a.poll();
        ans.add(a.peek());
        }}
        return ans;
    }
}