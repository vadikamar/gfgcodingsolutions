//{ Driver Code Starts
//Initial Template for Java



import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().sumBitDifferences(arr, n));
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    long sumBitDifferences(int[] arr, int n) {
        int bitCount[] = new int[32];

        // Count the number of set bits at each position
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 32; j++) {
                if ((arr[i] & (1 << j)) != 0) {
                    bitCount[j]++;
                }
            }
        }

        long c = 0;

        // Calculate the sum of differences for each position
        for (int i = 0; i < 32; i++) {
            int setBits = bitCount[i];
            int unsetBits = n - setBits;
            c += (long) setBits * unsetBits;
        }

        return c * 2; // Multiply by 2 to get the total sum of bit differences
    }
}
