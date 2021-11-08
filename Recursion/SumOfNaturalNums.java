import java.util.*;

class GFG {
    public static int SumOfNaturalNums(int n){
        if(n <= 1) return n;
        return n+SumOfNaturalNums(n-1);
    }
    
	public static void main (String[] args) {
	    int n = 5;
		System.out.println(SumOfNaturalNums(n));
	}
}
