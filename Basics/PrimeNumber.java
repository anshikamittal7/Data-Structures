import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int i=2;
		boolean isprime=true;
		while(i<num){
		    int rem=num%i;
		    if (rem==0){
		       isprime=false;
		    }
		     i=i+1;
		}
		if(isprime==true){
		    System.out.println("prime");
		}else{
		    System.out.println("not prime");
		}
	}
}
