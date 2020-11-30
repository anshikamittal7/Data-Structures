import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int rev=0;
		while(num!=0){
		    int r=num%10;
		    num=num/10;
		    rev=rev*10+r;
		   
		}
		 System.out.println(rev);
		
		
		
	}
}
