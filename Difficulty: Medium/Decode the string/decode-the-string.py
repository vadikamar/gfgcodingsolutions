#User function Template for python3

class Solution:
    def decodedString(self, s):
        # code here
        a=[]
        for i in range(len(s)):
            if s[i]!=']':
                a.append(s[i])
            else:
                sub=''
                while a[-1]!='[':
                    sub=a.pop()+sub
                a.pop()
                k=''
                while a and a[-1].isdigit():
                    k=a.pop()+k
                a.append(int(k)*sub)
        return "".join(a)





#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        s = input()

        ob = Solution()
        print(ob.decodedString(s))
        print("~")

# } Driver Code Ends