#{ 
 # Driver Code Starts
#Initial Template for Python 3

import math




    
# } Driver Code Ends
#User function Template for python3

class Solution:
    
    #Function to find the first position with different bits.
    def posOfRightMostDiffBit(self,m,n):
        #Your code here
        b1=bin(m)
        b1=b1[2:]
        b2=bin(n)
        b2=b2[2:]
        if len(b1)>len(b2):
            for i in range(len(b1)-len(b2)):
                b2="0"+b2
        elif len(b1)<len(b2):
            for i in range(len(b2)-len(b1)):
                b1="0"+b1
        for i in range(len(b1)):
            if b1[len(b1)-i-1]!=b2[len(b1)-i-1]:
                return i+1
        return -1 

#{ 
 # Driver Code Starts.
    
def main():
    
    T=int(input())
    
    while(T>0):
        
        
        mn=[int(x) for x in input().strip().split()]
        m=mn[0]
        n=mn[1]
        ob=Solution()
        print(math.floor(ob.posOfRightMostDiffBit(m,n)))
        
        
        
        
        T-=1
    
    




if __name__=="__main__":
    main()
# } Driver Code Ends