#User function Template for python3

class Solution:
    
    #Function to return a list of integers denoting spiral traversal of matrix.
    def spirallyTraverse(self,matrix): 
        # code here 
        r,c=len(matrix),len(matrix[0])
        ans=[]
        d=e=i=0
        while(True):
            for j in range(i,c-i):
                e=matrix[i][j]
                ans.append(e)
                d+=1
            if(d>=(r*c)):
                break
            for j in range(i+1,r-i):
                e=matrix[j][c-1-i]
                ans.append(e)
                d+=1
            if(d>=(r*c)):
                break
            for j in reversed(range(i,c-1-i)):
                e=matrix[r-1-i][j]
                ans.append(e)
                d+=1
            if(d>=(r*c)):
                break
            for j in reversed(range(i+1,r-1-i)):
                e=matrix[j][i]
                ans.append(e)
                d+=1
            if(d>=(r*c)):
                break
            i+=1
        return ans





#{ 
 # Driver Code Starts
if __name__ == "__main__":
    import sys
    input = sys.stdin.read
    data = input().split()

    t = int(data[0])
    index = 1
    for _ in range(t):
        r = int(data[index])
        c = int(data[index + 1])
        index += 2
        matrix = []
        for i in range(r):
            row = list(map(int, data[index:index + c]))
            matrix.append(row)
            index += c

        solution = Solution()
        result = solution.spirallyTraverse(matrix)
        print(" ".join(map(str, result)))

# } Driver Code Ends