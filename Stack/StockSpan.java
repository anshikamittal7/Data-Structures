class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int arr[], int n)
    {
        int ans[]=new int[n];
        Stack<Integer> s = new Stack<>();
        s.push(0);
        ans[0]=1;
        for(int i=1;i<n;i++){
            ans[i]=1;
            while(!s.isEmpty() && arr[i]>=arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                ans[i]=i+1;
            }
            else{
                ans[i]=i-s.peek();
            }
            s.push(i);
        }
        return ans;
    }
    
}
