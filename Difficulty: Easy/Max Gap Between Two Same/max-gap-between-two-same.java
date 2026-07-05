class Solution {
    public int maxCharGap(String s) {
        // code here
        int m=-1;
        for(char ch:s.toCharArray()){
            if(s.indexOf(ch)-s.lastIndexOf(ch)!=0)
            m=Math.max(Math.abs(s.indexOf(ch)-s.lastIndexOf(ch))-1,m);
        }
        return m;
    }
};