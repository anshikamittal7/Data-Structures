class Solution {
    public int countDigits(int num){
        int c = 0;
        while(num!=0){
            num=num/10;
            c++;
        }
        if(c%2==0) return 1;
        return 0;
    }
    public int findNumbers(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans+=countDigits(nums[i]);
        }
        return ans;
    }
}
