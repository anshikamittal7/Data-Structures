class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        if(r*c != m*n){
            return mat;
        }
        int[][] newMat = new int[r][c];
        int row = 0;
        int col = 0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                newMat[row][col]=mat[i][j];
                col++;
                if(col>=c){
                    row++;
                    col=0;
                }
            }
        }
        return newMat;
    }
}
