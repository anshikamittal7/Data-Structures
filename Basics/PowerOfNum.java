import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int x=s.nextInt();
		int ans=1;
		int i=1;
		while (i<=x){
		    ans=ans*n;
		    i=i+1;
		    if (n==0){
		    ans=1;
		    
		}if (x==0){
		    ans=1;
		}
	
		}
		System.out.println(ans);
	}
}
