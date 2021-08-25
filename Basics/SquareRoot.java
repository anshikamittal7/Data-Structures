import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();int ans=0;int i=1;
		for(i=1;i*i<=n;i++);
		System.out.println(--i);
	}
}
