class Solution {
    int surround(int [][] mat, int tot_rows,int tot_cols , int work_row,int work_col)
    {
       int cal_row,cal_col;
       int sum=mat[work_row][work_col];
       int surr_ctr=1;

        cal_row=work_row-1;
        cal_col=work_col;
        if(cal_row>=0)
        {
            sum=sum+mat[cal_row][cal_col];
            surr_ctr++;
        }
       
        cal_row=work_row-1;
        cal_col=work_col+1;
        if(cal_row>=0 && cal_col<tot_cols)
        {
            sum=sum+mat[cal_row][cal_col];
            surr_ctr++;
        }
        
        cal_row=work_row;
        cal_col=work_col+1;
        if(cal_col<tot_cols)
        {
            sum=sum+mat[cal_row][cal_col];
            surr_ctr++;
        }

        cal_row=work_row+1;
        cal_col=work_col+1;
        if(cal_row<tot_rows && cal_col<tot_cols)
        {
            sum=sum+mat[cal_row][cal_col];
            surr_ctr++;
        }
        
        cal_row=work_row+1;
        cal_col=work_col;
        if(cal_row<tot_rows)
        {
            sum=sum+mat[cal_row][cal_col];
            surr_ctr++;
        }
        
        cal_row=work_row+1;
        cal_col=work_col-1;
        if(cal_row<tot_rows &&cal_col>=0)
        {
            sum=sum+mat[cal_row][cal_col];
            surr_ctr++;
        }
        
        cal_row=work_row;
        cal_col=work_col-1;
        if(cal_col>=0)
        {
            sum=sum+mat[cal_row][cal_col];
            surr_ctr++;
        }
        
        cal_row=work_row-1;
        cal_col=work_col-1;
        if(cal_row>=0 &&cal_col>=0)
        {
            sum=sum+mat[cal_row][cal_col];
            surr_ctr++;
        }
        return sum/surr_ctr;
    }
    public int[][] imageSmoother(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int [][]res=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++){
                res[i][j]=surround(mat,m,n,i,j);
            }
        }
        return res;
    }
}