import java.util.*;

class GFG {
    public static int ans = 0;
    public static int rev1(int n){
        if(n == 0) return ans;
        
        if(n > 0){
            int rem = n%10;
            ans = ans*10 + rem;
            return rev1(n/10);
        }
        return ans;
        
    }
    public static void rev2(int n){
        if(n < 10) {
            System.out.print(n);
            return ;
        }
        System.out.print(n%10);
        rev2(n/10);
        
    }
    
    public static int rev3(int n){
        if(n == 0) return 0;
        int digits = (int)(Math.log10(n))+1;
        return helper(n,digits);
    }
    public static int helper(int n, int digits){
        if(n < 10) return n;
        int rem = n%10;
        return rem*(int)(Math.pow(10,digits-1))+helper(n/10,digits-1);
    }
    
	public static void main (String[] args) {
	    int n = 1002;
	    System.out.println(rev1(n));
		rev2(n);
        System.out.println();
        System.out.println(rev3(n));
	}
}
