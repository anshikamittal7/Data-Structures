import java.util.*;

class GFG {
    public static boolean CkeckPrime(int n, int i){
        if(i > Math.sqrt(n)) return true;
        if(n <= 2) return (n == 2);
        if(n % i == 0){
            return false;
        }
        return CkeckPrime(n, i+1);
    }
    
	public static void main (String[] args) {
	    int n = 18;
		System.out.println(CkeckPrime(n,2));
	}
}
