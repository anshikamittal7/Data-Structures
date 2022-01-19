class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int n=1;
        for(int i:nums){
            if(i==n){
                n++;
            }
        }
        return n;
    }
}

