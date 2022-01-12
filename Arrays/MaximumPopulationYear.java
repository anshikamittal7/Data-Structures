class Solution {
    public int maximumPopulation(int[][] logs) {
        int bucket[]=new int[2051-1950];
        for(int i=0;i<logs.length;i++){
            for(int j=logs[i][0];j<logs[i][1];j++){
                bucket[j-1950]++;
            }
        }
        int max = 2050;
        for(int i=2050;i>=1950;i--){
            if(bucket[i-1950]>=bucket[max-1950]){
                max = i;
            }
        }
        return max;
    }
}
