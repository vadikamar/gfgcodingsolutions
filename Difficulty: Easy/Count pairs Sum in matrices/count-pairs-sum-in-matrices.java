class Solution {
    int countPairs(int[][] mat1, int[][] mat2, int x) {
        // code here
        int i=0,j=0,n=mat1.length,ans=0; //pointer mat1
        int a=n-1,b=n-1; //pointer mat2;
        while(i<n && a>=0){
            if(mat1[i][j]+mat2[a][b]==x){
                ans++;
                if(j==n-1){
                    i++;
                    j=0;
                }else{
                    j++;
                }
                if(b==0){
                    a--;
                    b=n-1;
                }else{
                    b--;
                }
            }else if(mat1[i][j]+mat2[a][b]<x){
                if(j==n-1){
                    i++;
                    j=0;
                }else{
                    j++;
                }
            }else{
                if(b==0){
                    a--;
                    b=n-1;
                }else{
                    b--;
                }
            }
        }
        return ans;
    }
}