class Solution:
    #User function Template for python3
    
    # arr[]: Input Array
    # N : Size of the Array arr[]
    #Function to count inversions in the array.
        
    def inversionCount(self, arr, n):
        # Your Code Here
        def merge_sort(arr):
            if len(arr) <= 1:
                return arr, 0
            
            mid = len(arr) // 2
            left, inversion_count_left = merge_sort(arr[:mid])
            right, inversion_count_right = merge_sort(arr[mid:])
            merged, inversion_count = merge(left, right)
        
            return merged, inversion_count + inversion_count_left + inversion_count_right
    
        def merge(left, right):
            merged = []
            inversion_count = 0
            i = j = 0
        
            while i < len(left) and j < len(right):
                if left[i] <= right[j]:
                    merged.append(left[i])
                    i += 1
                else:
                    merged.append(right[j])
                    inversion_count += len(left) - i
                    j += 1
        
            merged.extend(left[i:])
            merged.extend(right[j:])
        
            return merged, inversion_count
        return merge_sort(arr)[1]


#{ 
 # Driver Code Starts
#Initial Template for Python 3

import atexit
import io
import sys

_INPUT_LINES = sys.stdin.read().splitlines()
input = iter(_INPUT_LINES).__next__
_OUTPUT_BUFFER = io.StringIO()
sys.stdout = _OUTPUT_BUFFER

@atexit.register

def write():
    sys.__stdout__.write(_OUTPUT_BUFFER.getvalue())

if __name__=='__main__':
    t = int(input())
    for tt in range(t):
        n = int(input())
        a = list(map(int, input().strip().split()))
        obj = Solution()
        print(obj.inversionCount(a,n))
# } Driver Code Ends