#User function Template for python3

class Solution:
	def helper(self, j, s, prevSm, dp):
        if(j == -1):
            return 1
        sm = 0
        c = 0
        key = (j, prevSm)
        if key in dp:
            return dp[key]
        for i in range(j, -1, -1):
            sm += int(s[i])
            if(prevSm == -1 or sm <= prevSm):
                c += self.helper(i-1, s, sm, dp)
            else:
                break
        dp[key] = c
        return c
            
    
    def TotalCount(self, s):
        return self.helper(len(s)-1, s, -1, {})
        #return res


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
	T=int(input())
	for i in range(T):
		s = input()
		ob = Solution()
		ans = ob.TotalCount(s)
		print(ans)
# } Driver Code Ends