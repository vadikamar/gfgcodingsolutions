class Solution {
    public ArrayList<Integer> findOrder(int n, int[][] prerequisites) {
        // code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int[] indegree = new int[n];
        for(int i = 0;i<n;i++){
            adj.add(new ArrayList<Integer>());
        }
        for(int i = 0;i<prerequisites.length;i++){
            int u = prerequisites[i][0];
            int v = prerequisites[i][1];
            adj.get(v).add(u);
            indegree[u]++;
        }
        Queue<Integer> q= new LinkedList<Integer>();
        for(int i = 0;i<n;i++){
            if(indegree[i] == 0) q.add(i);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while(!q.isEmpty()){
            int node = q.remove();
            ans.add(node);
            for(Integer it : adj.get(node)){
                indegree[it]--;
                if(indegree[it] == 0){
                    q.add(it);
                }
            }
        }
        if(ans.size() != n) {
            ArrayList<Integer> ans1 = new ArrayList<>();
            ans1.add(0);
            return ans1;
        }
        return ans;
    }
}