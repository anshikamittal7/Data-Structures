class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int d1=0;
        for(int i=0,j=n-1;i<n;i++,j--){
            d1+=mat[i][j]+mat[i][i];
        }
        if(n%2!=0) return d1-mat[n/2][n/2];
        return d1;
    }
}