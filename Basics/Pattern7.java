import java.util.*;

class GFG {
	public static void main (String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int i=1;
	int val=i;
	while(i<=n){
	    int j=1;
	    while(j<=n){
	        System.out.print(val+" ");
	        val=val+2;
	        j++;
	    }
	    i++;
	    System.out.println();
	}
	}
}
