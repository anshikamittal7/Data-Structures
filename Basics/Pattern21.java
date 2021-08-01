/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++){
		    for(int space=1;space<=n-i;space++){
		        System.out.print(" ");
		    }
		    for(int j=1;j<=i;j++){
		        System.out.print(j);
		    }
		    for(int k=i-1;k>=1;k--){
		        System.out.print(k);
		    }
		    System.out.println();
		}
	}
}



  1
 121
12321
