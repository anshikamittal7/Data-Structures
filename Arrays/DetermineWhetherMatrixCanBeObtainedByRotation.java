class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        boolean arr[] = {true,true,true,true};
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]!=target[i][j]) arr[0]=false;
                if(mat[i][j]!=target[j][n-1-i]) arr[1]=false;  
                if(mat[i][j]!=target[n-1-i][n-j-1]) arr[2]=false;
                if(mat[i][j]!=target[n-j-1][i]) arr[3]=false;
            }
        }
        for(int i=0;i<4;i++){
            if(arr[i]==true){
                return true;
            }
        }
        return false;
    }
}
