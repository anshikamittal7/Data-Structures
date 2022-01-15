class Solution {
    public int minCostToMoveChips(int[] position) {
        int a = 0;
        int b = 0;
        for(int i:position){
            if((i&1)==1) a++;
            else b++;
        }
        return Math.min(a,b);
    }
}