class Solution {
    public int integerReplacement(int m) {
        int count = 0;
        long n=m;
        while(n>1){
            if((n&1)==0){
                n=n/2;
                count++;
            }
            else{
                if(n==3 || (((n-1)/2)&1)==0){
                    n--;
                }
                else{
                    n++;
                }
                count++;
            }
        }
        return count;
    }
}