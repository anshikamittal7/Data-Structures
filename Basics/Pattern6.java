import java.util.*;

class GFG {
	public static void main (String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int val=n;
	int i=1;
	while (i<=n){
	    int j=1;
	    while (j<=n){
	        System.out.print(val+" ");
	        val++;
	        j++;
	        
	    }
	    i++;
	    System.out.println();
	}
	}
}
