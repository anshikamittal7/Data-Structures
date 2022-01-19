class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int num=1;
        for(int layer=0;layer<(n+1)/2;layer++){
            for(int ptr=layer;ptr<n-layer;ptr++){
                ans[layer][ptr]=num++;
            }
            for(int ptr=layer+1;ptr<n-layer;ptr++){
                ans[ptr][n-layer-1]=num++;
            }
            for(int ptr=n-2-layer;ptr>=layer;ptr--){
                ans[n-layer-1][ptr]=num++;
            }
            for(int ptr=n-2-layer;ptr>layer;ptr--){
                ans[ptr][layer]=num++;
            }
        }
        return ans;
    }
}