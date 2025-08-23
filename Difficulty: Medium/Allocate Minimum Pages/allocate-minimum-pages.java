class Solution {
    public static boolean isPos(int[] arr,int k,int minDis){
        int sum=0;
        int number=1;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>minDis)
                return false;
            if(sum+arr[i] > minDis){
                number++;
                sum=arr[i];
            }
            else{
                sum+=arr[i];
            }    
            
        }
        
        return number<=k;
        
    }
    
    public int findPages(int[] arr, int k) {
        // code here
        if(arr.length < k)
            return -1;
        
        int low=0;
        int high=0;
        
        for(int ele:arr){
            high+=ele;
        }
        
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPos(arr,k,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
                
        }
        
        return ans;
    }
}