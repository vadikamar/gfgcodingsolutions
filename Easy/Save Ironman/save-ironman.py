#User function Template for python3

def saveIronman (s) : 
    #Complete the function
    x=[]
    for i in s:
        if i.isalpha() or i.isnumeric():
            x.append(i.upper())
    y=x[::-1]
    return x==y


#{ 
 # Driver Code Starts
#Initial Template for Python 3

    

for _ in range(0,int(input())):
    s = input()
    ans = saveIronman(s)
    if(ans == True):
        print("YES")
    else:
        print("NO")
# } Driver Code Ends