#User function Template for python3
class Solution:

    def printLargest(self,n,arr):
        # code here
        arr = list(map(str, arr))
        def compare(a, b):
            if a + b > b + a:
                return -1
            else:
                return 1
        arr = sorted(arr, key=functools.cmp_to_key(compare))
        result = ''.join(arr)
        result = result.lstrip('0')
        if result == '':
            return '0'
        else:
            return result
        
        





#{ 
 # Driver Code Starts
#Initial Template for Python 3

import functools

if __name__ == '__main__':
    tc = int(input())
    while tc > 0:
        n = int(input())
        arr = list(map(str, input().strip().split()))
        ob = Solution()
        ans = ob.printLargest(n, arr)
        print(ans)
        tc -= 1

# } Driver Code Ends