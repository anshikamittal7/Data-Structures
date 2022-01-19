class Solution {
    public int[][] generateMatrix(int n) {
        int spiral[][]=new int[n][n];
        int num = 1;
        int row = n;
        int col = n;
        int rowStart=0;
        int colStart=0;
        while(num<=n*n){
            for(int i=colStart;num<=n*n&&i<col;i++){
                spiral[rowStart][i]=num;num++;
            }
            rowStart++;
            for(int i=rowStart;num<=n*n&&i<row;i++){
                spiral[i][col-1]=num;num++;
            }
            col--;
            for(int i=col-1;num<=n*n&&i>=colStart;i--){
                spiral[row-1][i]=num;num++;
            }
            row--;
            for(int i=row-1;num<=n*n&&i>=rowStart;i--){
                spiral[i][colStart]=num;num++;
            }
            colStart++;
        }
        return spiral;
    }
}