import java.util.*;

class GFG {
	public static void main (String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
    int ans=factorial(n);
    System.out.println(ans);
	}
	public static int factorial(int num){
	    int fac=1;
	    for (int i=num;i>=1;i--){
	        fac=fac*i;
	        if (num==0){
	            fac=1;
	        }
	        
	    }
	    System.out.println(fac);
	    return fac;
	}
	
}
