class Solution {
    public int searchInsertK(int arr[], int k) {
        // code here
        int l=0,u=arr.length-1;
        while(l<=u){
            int m=(l+u)/2;
            if(arr[m]==k){
                return m;
            }
            else if(arr[m]>k){
                u=m-1;
            }
            else{
                l=m+1;
            }
        }
        return l;
    }
};