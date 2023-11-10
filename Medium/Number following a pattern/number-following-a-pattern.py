#User function Template for python3
class Solution:
    def printMinNumberForPattern(ob,S):
        # code here 
        i, n = 0, len(S)
        stack = list(range(9, 0, -1))
        ans = []
        while i < n:
            if S[i] == 'I':
                if not ans:
                    ans.append(stack.pop())
                ans.append(stack.pop())
                i += 1
            else:
                r = []
                if ans:
                    stack.append(ans[-1])
                    ans = ans[:-1]
                while i < n and S[i] == 'D':
                    r.append(stack.pop())
                    i += 1
                r.append(stack.pop())
                ans.extend(r[::-1])
        ret = 0
        for e in ans:
            ret = ret*10 + e
        return ret


#{ 
 # Driver Code Starts
#Initial Template for Python 3
if __name__ == '__main__': 
    t = int (input ())
    for _ in range (t):
        
        S=str(input())

        ob = Solution()
        print(ob.printMinNumberForPattern(S))
# } Driver Code Ends