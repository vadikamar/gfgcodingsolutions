class Solution {
    public ArrayList<ArrayList<Integer>> kClosest(int[][] points, int k) {
        // code here
        int dis[][]=new int[points.length][3];
        int j=0;
        for(int i[]:points){
            dis[j][0]=i[0];
            dis[j][1]=i[1];
            int sq=(int)Math.pow(i[0],2)+(int)Math.pow(i[1],2);
            dis[j][2]=sq;
            j++;
        }
        Arrays.sort(dis,(a,b)->a[2]-b[2]);
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        for(int i=0;i<k;i++){
            ArrayList<Integer> x=new ArrayList<>();
            x.add(dis[i][0]);
            x.add(dis[i][1]);
            ans.add(x);
        }
        return ans;
    }
}