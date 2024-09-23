#User function Template for python3

class Solution:
    def findTwoElement( self,arr): 
        # code here
        a=b=sum=0
        n=len(arr)
        arr.sort()
        for i in range(n-1):
            if(arr[i]==arr[i+1]):
                b=arr[i]
            sum+=arr[i]
        sum=sum+arr[n-1]-b
        a=abs(sum-int(n*(n+1)/2))
        return [b,a]
            





#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':

    tc = int(input())
    while tc > 0:
        n = int(input())
        arr = list(map(int, input().strip().split()))
        ob = Solution()
        ans = ob.findTwoElement(arr)
        print(str(ans[0]) + " " + str(ans[1]))
        tc = tc - 1

# } Driver Code Ends