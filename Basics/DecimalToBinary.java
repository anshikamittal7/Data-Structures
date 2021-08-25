import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();int temp=n;int ans=0;
		int i=1;	
		while(temp!=0){
		    ans+=(temp%2*i);
		    i*=10;
		    temp=temp/2;
		}
		System.out.println(ans);
	}
}
