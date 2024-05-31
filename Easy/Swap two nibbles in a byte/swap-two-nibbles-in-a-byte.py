#User function Template for python3
class Solution:
    def swapNibbles (self, n):
        # code here 
        b=bin(n)
        b=b[2:]
        while len(b)!=8:
            b="0"+b
        c=b[4:]
        d=b[:4]
        ans=int(c+d,2)
        return ans
        


#{ 
 # Driver Code Starts
#Initial Template for Python 3
if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        n = int(input())

        ob = Solution()
        print(ob.swapNibbles(n))

# } Driver Code Ends