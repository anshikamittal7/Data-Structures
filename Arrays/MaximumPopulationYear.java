class Solution {
    public int maximumPopulation(int[][] logs) {
        int bucket[]=new int[2051];
        for(int i=0;i<logs.length;i++){
            for(int j=logs[i][0];j<logs[i][1];j++){
                bucket[j]++;
            }
        }
        int max = 0;
        int k=0;
        for(int i=2050;i>=1950;i--){
            if(bucket[i]>=max){
                max = bucket[i];
                k=i;
            }
        }
        return k;
    }
}