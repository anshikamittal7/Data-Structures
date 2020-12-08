import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int l=s.nextInt();
		int b=s.nextInt();
		squareornot(l,b);
	}
	public static void squareornot(int l,int b){
	    if (l==b){
	        System.out.println("square");
	    }else{
	        System.out.println("rectangle");
	    }
	}
}
