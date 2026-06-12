class Solution {
  public:
   int solve(int a, int b,int mod)
    {
        int ans = 1;
        while(b)
        {
            if(b&1)
            {
                ans = (ans*1LL*a)%mod;
            }
            a = (a*1LL* a)%mod;
            b >>= 1;
        }
        
        return ans;
    }
    int computeValue(int n) {
        // code here
        int mod = 1000000007;
        int num = 1;
        int deno = 1;
        for(int i = 0; i<n; i++)
        {
            num = (num* 1LL*(2*n - i)) % mod;
            deno = (deno *1LL* (i+1) ) % mod;
        }
        
        int deno_modified = solve(deno, mod-2, mod);
        
        return (num *1LL* deno_modified)%mod;
    }
};