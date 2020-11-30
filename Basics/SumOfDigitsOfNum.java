import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int sum=0;
		int r=0;
		while (num!=0){
		    
		    r=num%10;
		    num=num/10;
		    sum=sum+r;
		    
		}System.out.println(sum);
	}
}
