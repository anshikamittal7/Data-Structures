import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		int ans=greatest(n1,n2);
		System.out.println(ans);
	}
	public static int greatest(int n1,int n2){
	    int bigger;
	    if (n1>n2){
	       bigger=n1;
	    }else{
	        bigger=n2;
	    }
	    System.out.println(bigger);
	    return bigger;
	}
}
