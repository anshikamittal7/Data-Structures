class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        for(int i=num.length-1;i>=0||k!=0;i--){
            if(i>=0) k+=num[i];
            ans.add(k%10);
            k=k/10;
        }
        Collections.reverse(ans);
        return ans;
    }
}