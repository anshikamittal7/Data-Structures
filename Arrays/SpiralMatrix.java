class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int colStart = 0;
        int rowStart = 0;
        int count=0;
        while(count<matrix.length*matrix[0].length){
            for(int i=colStart;count<matrix.length*matrix[0].length&&i<n;i++){
                ans.add(matrix[rowStart][i]);
                count++;
            }
            rowStart++;
            for(int i=rowStart;count<matrix.length*matrix[0].length&&i<m;i++){
                ans.add(matrix[i][n-1]);
                count++;
            }
            n--;
            for(int i=n-1;count<matrix.length*matrix[0].length&&i>=colStart;i--){
                ans.add(matrix[m-1][i]);
                count++;
            }
            m--;
            for(int i=m-1;count<matrix.length*matrix[0].length&&i>=rowStart;i--){
                ans.add(matrix[i][colStart]);
                count++;
            }
            colStart++;
        }
        return ans;
    }
}