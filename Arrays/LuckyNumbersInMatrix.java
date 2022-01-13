class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            int q=0;
            int min = matrix[i][0];
            for(int j=1;j<n;j++){
                if(min>matrix[i][j]){
                    min=matrix[i][j];
                    q=j;
                }
            }
            boolean flag=true;
            for(int j=0;j<m;j++){
                if(min<matrix[j][q]){
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                list.add(min);
            }
        }
        return list;
    }
}
