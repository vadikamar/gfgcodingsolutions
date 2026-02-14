#User function Template for python3

class Solution:

    def findMinDiff(self, A,M):

        # code here
        A.sort()
        ans=1000000000
        N=len(A)
        i=0
        j=M-1
        while(j<N):
            ans=min(ans,A[j]-A[i])
            i+=1
            j+=1
        return ans