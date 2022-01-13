class Solution {
    public int[] sumZero(int n) {
        int arr[]=new int[n];
        for(int i=0;i<n/2;i++){
            arr[i]=i-n;
            arr[n-1-i]=n-i;
        }
        return arr;
    }
}
