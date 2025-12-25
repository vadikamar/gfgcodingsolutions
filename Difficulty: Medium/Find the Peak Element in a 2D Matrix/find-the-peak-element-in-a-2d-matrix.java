class Solution {
    public ArrayList<Integer> findPeakGrid(int[][] mat) {
        // code here
        ArrayList<Integer> x=new ArrayList<>();
        int n=mat.length,m=mat[0].length;
        if(n==1){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<m;j++){
                if(mat[0][j]>max){
                    max=mat[0][j];
                    x.clear();
                    x.add(0);
                    x.add(j);
                }
            }
            return x;
        }
        else if(m==1){
            int max=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                if(mat[i][0]>max){
                    max=mat[i][0];
                    x.clear();
                    x.add(i);
                    x.add(0);
                }
            }
            return x;
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(i==0 && j==0 && i+1<n && j+1<m){
                    if(mat[i][j]>=mat[i+1][j] && 
                    mat[i][j]>=mat[i][j+1]){
                        x.add(i);
                        x.add(j);
                        break;
                    }
                }
                else if(i==n-1 && j==m-1 && i-1>=0 && j-1>=0){
                    if(mat[i][j]>=mat[i-1][j] && 
                    mat[i][j]>=mat[i][j-1]){
                        x.add(i);
                        x.add(j);
                        break;
                    }
                }
                else if(i==n-1 && j==0 && i-1>=0 && j+1<m){
                    if(mat[i][j]>=mat[i-1][j] && 
                    mat[i][j]>=mat[i][j+1]){
                        x.add(i);
                        x.add(j);
                        break;
                    }
                }
                else if(i==0 && j==m-1 && i+1<n && j-1>=0){
                    if(mat[i][j]>=mat[i+1][j] && 
                    mat[i][j]>=mat[i][j-1]){
                        x.add(i);
                        x.add(j);
                        break;
                    }
                }
                else if(i==0 && i+1<n && j-1>=0 && j+1<m){
                    if(mat[i][j]>=mat[i+1][j] && 
                    mat[i][j]>=mat[i][j-1] &&
                    mat[i][j]>=mat[i][j+1]){
                        x.add(i);
                        x.add(j);
                        break;
                    }
                }
                else if(j==0 && i+1<n && i-1>=0 && j+1<m){
                    if(mat[i][j]>=mat[i-1][j] && 
                    mat[i][j]>=mat[i][j+1] &&
                    mat[i][j]>=mat[i+1][j]){
                        x.add(i);
                        x.add(j);
                        break;
                    }
                }
                else if(j==m-1 && i+1<n && i-1>=0 && j-1>=0){
                    if(mat[i][j]>=mat[i-1][j] && 
                    mat[i][j]>=mat[i][j-1] &&
                    mat[i][j]>=mat[i+1][j]){
                        x.add(i);
                        x.add(j);
                        break;
                    }
                }
                else if(i==n-1 && i-1>=0 && j-1>=0 && j+1<m){
                    if(mat[i][j]>=mat[i-1][j] && 
                    mat[i][j]>=mat[i][j-1] &&
                    mat[i][j]>=mat[i][j+1]){
                        x.add(i);
                        x.add(j);
                        break;
                    }
                }
                else if(j-1>=0 && j+1<m && i-1>=0 && i+1<n){
                    if(mat[i][j]>=mat[i-1][j] && 
                    mat[i][j]>=mat[i][j-1] &&
                    mat[i][j]>=mat[i][j+1] &&
                    mat[i][j]>=mat[i+1][j]){
                        x.add(i);
                        x.add(j);
                        break;
                    }
                }
            }
            if(x.size()==2) break;
        }
        //System.out.println(x);
        return x;
    }
}