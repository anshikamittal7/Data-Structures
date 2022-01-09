class Solution {
    public List<Boolean> kidsWithCandies(int[] nums, int extraCandies) {
        ArrayList<Boolean> ans = new ArrayList<>(nums.length);
        int max = nums[0];
        for(int i:nums){
            if(max<i) max = i;
        }
        for(int i:nums){
            ans.add(i+extraCandies>=max);
        }
        return ans;
    }
}
