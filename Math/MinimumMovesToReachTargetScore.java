class Solution {
    public int minMoves(int target, int maxDoubles) {
        int c=0;
        while(target!=1 && maxDoubles!=0){
            if(target%2 == 0){
                target=target/2;
                maxDoubles--;
            }
            else{
                target--;
            }
            c++;
        }
        return c+target-1;
    }
}