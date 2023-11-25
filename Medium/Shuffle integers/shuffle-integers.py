class Solution:
    def shuffleArray(self, arr, n):
        # Your code goes here
        ans=[]

        for i in range(0,n//2):

            ans.append(arr[i])

            ans.append(arr[i+n//2])

        arr.clear()

        arr.extend(ans)

#{ 
 # Driver Code Starts
if __name__ == '__main__': 
    
    t=int(input())
    for _ in range(0,t):
        n=int(input())
        a = list(map(int,input().split()))
        ob = Solution()
        ob.shuffleArray(a,n)
        print(*a)
# } Driver Code Ends