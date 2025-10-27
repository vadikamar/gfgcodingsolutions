class Solution {

  private:

    vector<vector<int>> dirs = {{-1, 0},{0, 1}, {1, 0}, {0, -1}};

    using tuple = pair<int, pair<int, int>>;

  public:

    // Function to find distance of nearest 1 in the grid for each cell.

    vector<vector<int>> nearest(vector<vector<int>>& grid) {

        // Code here

        int n = grid.size();

        int m = grid[0].size();

        vector<vector<bool>> vis (n, vector<bool>(m, false));

        vector<vector<int>> dis (n, vector<int>(m, 0));

        queue<tuple> q;

        for (int i = 0; i < n; ++i) {

            for (int j = 0; j < m; ++j) {

                if (grid[i][j]) {

                    vis[i][j] = true;

                    q.push ({0, {i, j}});

                }

            }

        }

        while (!q.empty()) {

            auto val = q.front().first;

            auto r = q.front().second.first;

            auto c = q.front().second.second;

            q.pop();

            dis[r][c] = val;

            for (auto& dir : dirs) {

                int nr = r + dir[0];

                int nc = c + dir[1];

                if (nr >= 0 and nr < n and nc >= 0 and nc < m and !vis[nr][nc]) {

                    vis[nr][nc] = true;

                    q.push ({val + 1, {nr, nc}});

                }

            }

        }

        return dis;

    }

};