import java.util.*;

class GFG {
	public static void main (String[] args) {
	Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		int value=1;
		while(i<=n){
		    int j=1;
		    while(j<=n){
		        System.out.print(value+" ");
		        value=value+1;
		        j++;
		    }
		   
		    System.out.println();
		     i++;
		}
	}
}
