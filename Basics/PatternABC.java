/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
	
		for(int i=1;i<=n;i++){
		    char a=(char)('A'+i-1);
		    for(int j=1;j<=n;j++){
		        System.out.print(a++);
		    }
		    System.out.println();
		}
	}
}
