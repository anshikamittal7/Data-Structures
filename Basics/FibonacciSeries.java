import java.util.*;

class GFG {
	public static void main (String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int i=0;
	    int f1=0;
	    int f2=1;
	    int f3=0;
	    System.out.println(f1);
	    System.out.println(f2);
	    while (i<n){
	        f3=f1+f2;
	        System.out.println(f3);
	        f1=f2;
	        f2=f3;
	        i++;
	    }
	}
}
