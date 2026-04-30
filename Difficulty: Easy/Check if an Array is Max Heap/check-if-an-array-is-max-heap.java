class Solution {
    public boolean isMaxHeap(int[] arr) {
        // code here
        int n=arr.length;
        for(int i=0;i<n;i++)
        {   //left child index =2i+1
           if(2*i+1<n) if(arr[(2*i)+1]>arr[i]) return false;
           //right child index =2i+2
           if(2*i+2<n) if(arr[(2*i)+2]>arr[i]) return false;   
           
        }
       return true;
    }
}