import java.math.BigInteger;

class Solution {
    static final int MOD = 1000000007;

    int minOperations(int[] b) {
        int n = b.length;
        boolean[] vis = new boolean[n];

        BigInteger lcm = BigInteger.ONE;

        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                int len = 0;
                int cur = i;

                while (!vis[cur]) {
                    vis[cur] = true;
                    cur = b[cur] - 1; // convert to 0-based index
                    len++;
                }

                BigInteger cycle = BigInteger.valueOf(len);
                BigInteger gcd = lcm.gcd(cycle);
                lcm = lcm.divide(gcd).multiply(cycle);
            }
        }

        return lcm.mod(BigInteger.valueOf(MOD)).intValue();
    }
}