#User function Template for python3

class Solution:
    def reversedBits(self, x):
        # code here 
        b=bin(x)
        b=b[2:]
        for i in range(0,32-len(b)):
            b="0"+b
        rb=b[::-1]
        return int(rb,2)


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 
    t = int (input ())
    for _ in range (t):
        X=int(input())
        
        ob = Solution()
        print(ob.reversedBits(X))
# } Driver Code Ends