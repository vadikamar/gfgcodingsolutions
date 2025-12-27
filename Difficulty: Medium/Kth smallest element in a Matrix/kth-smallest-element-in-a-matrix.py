class Solution:
    def kthSmallest(self, mat, k):
        # code here
        a=[]
        n=len(mat)
        for i in range(n):
           for j in range(n):
              a.append(mat[i][j])
        a.sort()
        return a[k-1]
        