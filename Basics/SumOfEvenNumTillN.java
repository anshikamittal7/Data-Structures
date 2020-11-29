
import java.util.*;

class GFG {
	public static void main (String[] args) {
	    Scanner s=new Scanner(System.in);
	    int N=s.nextInt();
	    int sum=0;
	    int i=1;
	    while(i<=N){
	        
	        i=i+1;
	        if (i%2==0){
	            sum=sum+i;
	        }
	        
	    }
	    System.out.println(sum);
	
	}
}
