class Solution {
    int [][] dir = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int count = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == '1'){
                    dfs(i, j, grid);
                    count++;
                }
            }
        }
        
        return count;
        
    }
    
    public void dfs(int r, int c, char [][] grid){
        if(r < 0 || c < 0 || r >= grid.length || c >= grid[0].length){
            return;
        }
        if(grid[r][c] != '1'){
            return;
        }
        grid[r][c] = '2';
        for(int d = 0; d < dir.length; d++){// d =0
            int [] darr = dir[d]; // [-1, 0]
            int nr = r + darr[0];// 0 + -1
            int nc = c + darr[1];
            dfs(nr, nc, grid);
        }
    }
}
