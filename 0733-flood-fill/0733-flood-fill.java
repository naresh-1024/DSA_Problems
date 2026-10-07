class Solution {
    void fun(int[][] mat, int sr, int sc, int t_rows, int t_cols,
             boolean[][] vis, int color, int oldcolor) {
        if(sr < 0 || sr >= t_rows || sc < 0 || sc >= t_cols)
            return;
        if(vis[sr][sc])
            return;
        if(mat[sr][sc] != oldcolor)
            return;
        vis[sr][sc] = true;
        mat[sr][sc] = color;
        fun(mat, sr-1, sc, t_rows, t_cols, vis, color, oldcolor);
        fun(mat, sr, sc+1, t_rows, t_cols, vis, color, oldcolor);
        fun(mat, sr+1, sc, t_rows, t_cols, vis, color, oldcolor);
        fun(mat, sr, sc-1, t_rows, t_cols, vis, color, oldcolor);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int t_rows = image.length;
        int t_cols = image[0].length;
        boolean[][] vis = new boolean[t_rows][t_cols];
        int oldcolor = image[sr][sc];
        if(oldcolor == color)
            return image;
        fun(image, sr, sc, t_rows, t_cols, vis, color, oldcolor);
        return image;
    }
}