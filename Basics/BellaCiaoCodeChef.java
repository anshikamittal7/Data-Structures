/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0){
		    int D=s.nextInt();int d=s.nextInt();int p=s.nextInt();int q=s.nextInt();
		    int ans=p*D+q*d*(D/d-1)*(D/d)/2;
		    if(D%d!=0) ans=ans+q*(D%d)*(D/d);
		    System.out.println(ans);
		}
	}
}
