class Solution {
    int fun(int [][]mat,int w_row,int w_col,int t_rows,int t_cols,boolean [][]vis){
        if(w_row < 0 || w_row >= t_rows || w_col < 0 || w_col >= t_cols)
            return 0;
        if (vis[w_row][w_col] || mat[w_row][w_col] == 0) {
            return 0;
        }
        vis[w_row][w_col]=true;
        int count = 1;
        count+=fun(mat,w_row-1,w_col,t_rows,t_cols,vis);
        count+=fun(mat,w_row,w_col+1,t_rows,t_cols,vis);
        count+=fun(mat,w_row+1,w_col,t_rows,t_cols,vis);
        count+=fun(mat,w_row,w_col-1,t_rows,t_cols,vis);
        return count;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int t_rows=grid.length;
        int t_cols=grid[0].length;
        boolean [] []vis = new boolean[t_rows][t_cols];
        int max=0;
        for (int i = 0; i < t_rows; i++) {
            for (int j = 0; j < t_cols; j++) {

                if (grid[i][j] == 1 && !vis[i][j]) {

                    int count = fun(grid, i, j,
                                   t_rows, t_cols, vis);

                    max = Math.max(max, count);
                }
            }
        }
        return max;
    }
}