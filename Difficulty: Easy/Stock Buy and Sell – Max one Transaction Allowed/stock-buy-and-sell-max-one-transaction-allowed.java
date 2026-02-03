class Solution {
    public int maxProfit(int[] prices) {
        // Code here
        int n=prices.length;
        int ans=0,min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(prices[i]<min)
            min=prices[i];
            else if(prices[i]-min>ans)
            ans=prices[i]-min;
        }
        return ans;
    }
}