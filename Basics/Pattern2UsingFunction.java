import java.util.*;

class GFG {
	public static void main (String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	pattern(n);
	}
	public static void pattern(int num){
	    for(int i=1;i<=num;i++){
	        for(int space=1;space<=num-i;space++){
	            System.out.print(" ");
	        }
	        for(int j=1;j<=i;j++){
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	}
}
