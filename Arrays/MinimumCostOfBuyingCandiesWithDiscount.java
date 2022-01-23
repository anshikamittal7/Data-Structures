class Solution {
    public int minimumCost(int[] cost) {
        int ans=0;
        // if(cost.length<=2){
        //     for(int i=0;i<cost.length;i++){
        //         ans+=cost[i];
        //     }
        //     return ans;
        // }
        Arrays.sort(cost);
        for(int i=cost.length-1;i>=0;i--){
            ans+=cost[i--];
            if(i>=0) ans+=cost[i--];
        }
        return ans;
    }
}