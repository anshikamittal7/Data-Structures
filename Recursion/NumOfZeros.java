import java.util.*;

class GFG {
    public static int numOfZeros(int n){
        if(n < 10) return 0;
        if(n%10 == 0) return 1+numOfZeros(n/10);
        return numOfZeros(n/10);
    }
	public static void main (String[] args) {
	    int n = 1;
	    System.out.println(numOfZeros(n));
	}
}
