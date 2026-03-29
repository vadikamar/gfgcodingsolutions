


class Solution {
public int countPartitions(int[] arr, int d) {
        int total = 0;
        int n = arr.length;
        for(int i:arr)  total+=i;
        
        if(total-d<0 || (total-d)%2==1) return 0;
        
        return countWays(n,arr,(total-d)/2);
    }
    int mod = (int)1e9+7;
    int countWays(int n,int a[],int target){
        Integer dp[][] = new Integer[n+1][target+1];
        // return solve(n-1,target,a,dp);
        // return solve(n,target,a);
        return solve_optimization(n,target,a);
    }
    int solve_optimization(int n,int target,int a[]){
        int prev[] = new int[target+1], cur[] = new int[target+1];
        
        if(a[0]==0) prev[0] = 2;
        else        prev[0] = 1;
        
        if(a[0]!=0 && target>=a[0])    prev[a[0]] = 1;
        
        for(int i=1;i<n;i++){
            for(int sum=0;sum<=target;sum++){
                
                int notTake = prev[sum], take = 0;
                if(sum>=a[i])   take = prev[sum-a[i]];
                
                cur[sum] = (take%mod + notTake%mod)%mod;
                
            }
            
            prev = cur;
            cur = new int[target+1];
        }
        
        return prev[target];
    }
    int solve(int n,int target,int a[]){
        int dp[][] = new int[n+1][target+1];
        
        
        if(a[0]==0) dp[0][0] = 2;
        else        dp[0][0] = 1;
        
        if(a[0]!=0 && target>=a[0])    dp[0][a[0]] = 1;
        
        
        for(int i=1;i<n;i++){
            for(int sum=0;sum<=target;sum++){
                
                int notTake = dp[i-1][sum], take = 0;
                if(sum>=a[i])   take = dp[i-1][sum-a[i]];
                
                dp[i][sum] = (take%mod + notTake%mod)%mod;
                
            }
        }
        
        return dp[n-1][target];
    }
    int solve(int i,int sum,int a[],Integer dp[][]){
        if(i==0){
            if(sum==0 && a[0]==0)   return 2;
            if(sum==0 || a[0]==sum) return 1;
            return 0;
        }
        
        if(dp[i][sum]!=null)  return dp[i][sum];
        
        
        int notTake = solve(i-1,sum,a,dp), take=0;
        
        if(sum>=a[i])   take = solve(i-1,sum-a[i],a,dp);
        
        return dp[i][sum] = (take%mod + notTake%mod)%mod;
    }
}
        
