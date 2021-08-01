/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++){
		    char a=(char)('A'+n-i);
		    for(int j=1;j<=i;j++){
		        System.out.print(a++);
		    }
		    System.out.println();
		}
		
	}
}



C
BC
ABC
