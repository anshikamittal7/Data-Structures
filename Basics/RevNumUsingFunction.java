import java.util.*;

class GFG {
	public static void main (String[] args) {
	    Scanner s=new Scanner(System.in);
	    int num=s.nextInt();
	    int ans=revnum(num);
	    System.out.println(ans);
	}
	public static int revnum(int n){
	    int rev=0;
	    while(n!=0){
	        int r=n%10;
	        n=n/10;
	        rev=rev*10+r;
	    }
	    System.out.println(rev);
	    return rev;
	}
}
