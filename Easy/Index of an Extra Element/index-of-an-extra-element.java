//{ Driver Code Starts
import java.util.*;

class ExtraElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n - 1];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < n - 1; i++) b[i] = sc.nextInt();
            Solution g = new Solution();
            System.out.println(g.findExtra(n, a, b));
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/
class Solution {
    public int findExtra(int n, int arr1[], int arr2[]) {
        // add code here.
        int low = 0;
        int high = n - 2; // arr2 has one less element than arr1
        
        while (low <= high) {
            int mid = (low + high) / 2;
            
            if (arr1[mid] == arr2[mid]) {
                // If elements are the same, the extra element must be further in arr1
                low = mid + 1;
            } else {
                // If elements are different, the extra element is at or before mid in arr1
                high = mid - 1;
            }
        }
       return low;
    }
}