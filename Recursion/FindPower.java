import java.util.*;

class GFG {
    public static int FindPow(int n, int a){
        if(n == 1) return 0;
        return 1+FindPow(n/a, a);
    }
    
	public static void main (String[] args) {
	    int n = 32, a = 2;
		System.out.println(FindPow(n,a));
	}
}
