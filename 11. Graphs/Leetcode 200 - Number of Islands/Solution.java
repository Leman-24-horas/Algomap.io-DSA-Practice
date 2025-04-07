class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int total = 0; // total num of islands

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == '1') {
                    total++;
                    dfs(grid, i, j);

                    /* the pt of dfs is that 
                    for every grid that is land
                    make it and it's adjacent grid that are also land
                    into water */
                }
            }
        }

        return total;
    }

    public void dfs(char[][] grid, int i, int j) {
        int m = grid.length;
        int n = grid[0].length;

        if(i < 0 || j < 0 || i >= m || j >= n || grid[i][j] != '1') {
            return;
        }

        grid[i][j] = '0'; // set grid to water

        dfs(grid, i+1, j);  
        dfs(grid, i-1, j);  
        dfs(grid, i, j+1); 
        dfs(grid, i, j-1);
    }
}