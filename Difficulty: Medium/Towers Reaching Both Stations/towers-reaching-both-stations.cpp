class Solution {
  public:
    int countCoordinates(vector<vector<int>>& g) {
        // code here
        int n=g.size();
        int m=g[0].size();
        bool in[n][m];
    memset(in,false,sizeof(in));
    queue<vector<int>>q;
    for(int i=0;i<n;i++)
    {
        q.push({i,0});
        in[i][0]=true;
    }
    for(int i=0;i<m;i++)
    {
        q.push({0,i});
        in[0][i]=true;
    }
    while(!q.empty())
    {
        vector<int>v=q.front();
        q.pop();
        int a=v[0];
        int b=v[1];
        if(a<n-1&&in[a+1][b]==false&&g[a+1][b]>=g[a][b])
        {
            in[a+1][b]=true;
            q.push({a+1,b});
        }
        if(b<m-1&&in[a][b+1]==false&&g[a][b+1]>=g[a][b])
        {
            in[a][b+1]=true;
            q.push({a,b+1});
        }
        if(a>0&&in[a-1][b]==false&&g[a-1][b]>=g[a][b])
        {
            in[a-1][b]=true;
            q.push({a-1,b});
        }
        if(b>0&&in[a][b-1]==false&&g[a][b-1]>=g[a][b])
        {
            in[a][b-1]=true;
            q.push({a,b-1});
        }
    }
    bool ar[n][m];
    memset(ar,false,sizeof(ar));
    for(int i=0;i<n;i++)
    {
        q.push({i,m-1});
        ar[i][m-1]=true;
    }
    for(int i=0;i<m;i++)
    {
        q.push({n-1,i});
        ar[n-1][i]=true;
    }
    while(!q.empty())
    {
        vector<int>v=q.front();
        q.pop();
        int a=v[0];int b=v[1];
        if(a<n-1&&ar[a+1][b]==false&&g[a+1][b]>=g[a][b])
        {
            ar[a+1][b]=true;
            q.push({a+1,b});
        }
        if(b<m-1&&ar[a][b+1]==false&&g[a][b+1]>=g[a][b])
        {
            ar[a][b+1]=true;
            q.push({a,b+1});
        }
        if(a>0&&ar[a-1][b]==false&&g[a-1][b]>=g[a][b])
        {
            ar[a-1][b]=true;
            q.push({a-1,b});
        }
        if(b>0&&ar[a][b-1]==false&&g[a][b-1]>=g[a][b])
        {
            ar[a][b-1]=true;
            q.push({a,b-1});
        }
    }
    int ans=0;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
        {
            if(ar[i][j]==true&&in[i][j]==true)
            ans++;
        }
    }
    return ans;
    }
};