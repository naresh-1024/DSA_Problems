class NumMatrix {
    int [] [] rps;
    public NumMatrix(int[][] mat) {
        rps= new int[mat.length][mat[0].length];
        int row,col;
        for(row=0;row<mat.length;row++)													
		{						
			rps[row][0]=mat[row][0];											
			for(col=1;col<mat[0].length;col++)											
				rps	[row]	[col]	=	mat	[row]	[col]	+	rps	[row]	[col-1]	;
        }
															
    }
    
    public int sumRegion(int row_st, int col_st, int row_end, int col_end) {
        int row;
        int sum=0;
        for(row=row_st;row<=row_end;row++)
        {
            if(col_st==0)
                sum+=	rps	[	row	]	[	col_end	];
            else
			sum+=	rps	[	row	]	[	col_end	]-rps[row][col_st-1	];
        }
        return sum;
																		

    }
}
/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */