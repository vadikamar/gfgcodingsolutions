class Solution:
    def dfs(self, s1, ind, m):
        if m == '':
            return 1
            
        if len(s1) <= ind:
            return 0
            
        if self.dp[len(m)-1][ind] != -1:
            return self.dp[len(m)-1][ind]

        c = self.dfs(s1, ind + 1, m)
        if s1[ind] == m[0]:
            c += self.dfs(s1, ind + 1, m[1:])

        self.dp[len(m)-1][ind] = c
        return c
    def countWays(self, s1, s2):
        # code here
        self.dp = [[-1]*len(s1) for _ in s2]
        return self.dfs(s1, 0, s2) % (10**9 + 7)
