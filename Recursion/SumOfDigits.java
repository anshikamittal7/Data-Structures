import java.util.*;

class GFG {
    public static int SumOfDigits(int n){
        if(n == 0) return 0;
        if(n < 0 ) return SumOfDigits(-n);
        return n%10 + SumOfDigits(n/10);
    }
    
	public static void main (String[] args) {
	    int num  = -1234;
		System.out.println(SumOfDigits(num));
	}
}
