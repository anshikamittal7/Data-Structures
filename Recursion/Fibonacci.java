import java.util.*;

class GFG {
    public static int Fibonacci(int n){
        if(n<2) return n;
        return Fibonacci(n-1) + Fibonacci(n-2);
    }
    
	public static void main (String[] args) {
		System.out.println(Fibonacci(7));
	}
}
