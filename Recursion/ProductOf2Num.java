import java.util.*;

class GFG {
    public static int ProductOf2Num(int n1, int n2){
        if(n1 == 0 || n2 == 0) return 0;
        if(n1<n2){
            return ProductOf2Num(n2, n1);
        }
        return n2+ProductOf2Num(n1-1, n2);
    }
    
	public static void main (String[] args) {
	    int n = 2;
	    int x = 9;
		System.out.println(ProductOf2Num(n,x));
	}
}
