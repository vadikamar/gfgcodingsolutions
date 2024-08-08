#User function Template for python3

class Solution:
    def Maximize(self, a): 
        # Complete the function
        n=len(a)
        a.sort()
        s=0
        m=pow(10,9)+7
        for i in range(n):
            s+=a[i]*i
        return s%m
        






#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())

    for _ in range(t):
        A = list(map(int, input().strip().split()))
        # k = int(input())
        ob = Solution()
        print(ob.Maximize(A))

# } Driver Code Ends