import java.util.*;

class GFG {
	public static void main (String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	fibonacci(n);
	}
	public static void fibonacci(int num){
	    int f1=0;
	    int f2=1;
	    System.out.println(f1);
	    System.out.println(f2); 
	    for(int i=1;i<=num;i++){
	        int f3=f1+f2;
	        f1=f2;
	        f2=f3;
	        System.out.println(f3);
	    }
	}
}
