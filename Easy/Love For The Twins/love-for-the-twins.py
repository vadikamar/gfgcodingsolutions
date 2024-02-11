class Solution:
    def getTwinCount(self, N , Arr):
        # code here 
        d = {}
        for num in Arr:
            d[num] = d.get(num,0) + 1
        s = 0
        for i in d.values():
            s += i//2
        return s*2


#{ 
 # Driver Code Starts

t = int (input ())
for _ in range (t):
    N=int(input())
    Arr=list(map(int,input().split()))
    
    ob = Solution()
    print(ob.getTwinCount(N,Arr))
# } Driver Code Ends