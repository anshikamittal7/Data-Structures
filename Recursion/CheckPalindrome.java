import java.util.*;

class GFG {
    public static boolean CheckPalindrome(int n){
        if(n == 0) return true;
        int temp = n;
        int digits = (int)(Math.log10(n)+1);
        return helper(n, digits, temp);
    }
    
    public static boolean helper(int n,int digits,int temp){
        if(n < 10) return true;
        int t = (temp/(int)(Math.pow(10,digits-1)));
        int rem = n%10;
        if(rem != t){
            return false;
        }
        return helper(n/10, digits-1,temp-(t*(int)(Math.pow(10,digits-1))));
    }
    
	public static void main (String[] args) {
	    int n = 112;
	    System.out.println(CheckPalindrome(n));
	    
	}
}
