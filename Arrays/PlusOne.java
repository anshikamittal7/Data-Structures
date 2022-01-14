class Solution {
    public int[] plusOne(int[] digits) {
        int carry=1;
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]+carry==10){
                digits[i]=0;
            }
            else{
                digits[i]+=carry;
                return digits;
            }
        }
        int arr[]=new int[digits.length+1];
        arr[0]=1;
        return arr;
    }
}
