class Solution {
    public boolean kSubstr(String s, int k) {
        // code here
        int n=s.length();
        if(n%k!=0) return false;
        String ss=s.substring(0,k);
        int cnt=n/k;
        int mod=0;
        for(int i=0,j=0;j<cnt;i=i+k,j++){
            if(!s.substring(i,i+k).equals(ss)){
                mod++;
            }
        }
        if(mod>1){
            mod=0;
            String sss=s.substring(n-k,n);
            for(int i=n-k,j=0;j<cnt;i=i-k,j++){
                if(!s.substring(i,i+k).equals(sss)){
                    mod++;
                    if(mod>1) return false;
                }
            }
        }
        return true;
    }
}