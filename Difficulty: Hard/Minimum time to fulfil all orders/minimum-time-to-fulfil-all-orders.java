class Solution {
    public int minTime(int[] arr, int n) {
        // code here
        int l = arr.length;
        int low = 1, high = Integer.MIN_VALUE;
        for (Integer e: arr) 
            high = Math.max(high, e);
        high = high*n*(n+1)/2;
        
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low)/2;
            int donuts = howMuchDonut(l, mid, arr);
            
            if (donuts >= n) {
                ans = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }
        
        return ans;
        
    }
    private static int howMuchDonut(int l, int mid, int[] arr) {
        int sum = 0;
        for (int i=0; i<l; i++) {
            int num = 2*mid/arr[i];
            int x = ( (int)Math.sqrt(1 + 4*num) - 1 )/2;
            sum += x;
        }  
        return sum;
    }
}