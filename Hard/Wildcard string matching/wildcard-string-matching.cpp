//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function template for C++
class Solution{
    public:
    bool helper(string &wild, string &pattern,int wi,int pi){
        
        if(wi == wild.length() && pi == pattern.length())
           return true ;
           
        if(pattern.length() == pi && wi < wild.length()){
            
            while(wi < wild.length() && wild[wi] == '*')
              wi++;
               
            return wi == wild.length();
        }
        
        if(pattern[pi] == wild[wi] || wild[wi] == '?')
           return helper(wild,pattern,wi+1,pi+1);
           
        if(wild[wi] == '*'){
            bool case1 = helper(wild,pattern,wi,pi+1); // treat as single char
            bool case2 = helper(wild,pattern,wi+1,pi); // treat as a null char
            
            return  case1 || case2 ;
        }
        
        return false ;
    }
    
    
    
    bool match(string wild, string pattern)
    {
        return helper(wild,pattern,0,0);
    }
};

//{ Driver Code Starts.
int main()
{
    int t;
    cin>>t;
    while(t-->0)
    {
        string wild, pattern;
        cin>>wild>>pattern;
        
        Solution ob;
        bool x=ob.match(wild, pattern);
        if(x)
        cout<<"Yes\n";
        else
        cout<<"No\n";
    }
    return 0;
}
// } Driver Code Ends