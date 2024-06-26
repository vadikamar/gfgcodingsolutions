#User function Template for python3

class Solution():
    def maxSumWithK(self, a, n, k):
        # Code here
        maxend = 0
        s = 0
        res = float('-inf')
        for i in range(n):
            s += a[i]
            if i >= k:
                s -= a[i - k]
                maxend = max(0, a[i - k], a[i - k] + maxend)
            if i >= k - 1:
                res = max(res, s + maxend)
        return res
    
    
    


#{ 
 # Driver Code Starts
#Initial Template for Python 3

def main():

    T = int(input())

    while(T > 0):
        n = int(input())
        a = [int(x) for x in input().strip().split()]
        k = int(input())
        
        ob = Solution()
        print(ob.maxSumWithK(a, n, k))

        T -= 1


if __name__ == "__main__":
    main()


# } Driver Code Ends