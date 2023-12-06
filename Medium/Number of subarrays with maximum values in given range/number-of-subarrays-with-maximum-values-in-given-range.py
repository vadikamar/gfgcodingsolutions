#User function Template for python3

class Solution:
    def countSubarrays(self, a,n,L,R): 
        # Complete the function
        def solve(a, n, k):
            maxi = float('-inf')
            start = 0
            ans = 0

            for i in range(n):
                maxi = max(a[i], maxi)
                if maxi > k:
                    start = i + 1
                    maxi = float('-inf')
                ans += i - start + 1

            return ans

        return solve(a, n, R) - solve(a, n, L - 1)


#{ 
 # Driver Code Starts
#Initial Template for Python 3



for _ in range(0,int(input())):
    n,l,r = map(int, input().strip().split())
    arr = list(map(int,input().strip().split()))
    ob = Solution()
    v = ob.countSubarrays(arr, n, l, r)
    print(v)
    
# } Driver Code Ends