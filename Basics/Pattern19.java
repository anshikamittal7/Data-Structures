
import java.util.*;

class GFG {
	public static void main (String[] args) {
	    Scanner s =new Scanner(System.in);
	    int n=s.nextInt();
	    int i=1;
	    while (i<=n){
	       
	        int j=1;
	        int val=i;
	        while(j<=i){
	            System.out.print(val);
	            j++;
	            val--;
	        }
	        System.out.println();
	        i++;
	    }
	}
}
