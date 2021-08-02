/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n/2+1;i++){
		    for(int sp=1;sp<=(n/2)-i+1;sp++){
		        System.out.print(" ");
		    }
		    for(int j=1;j<=2*i-1;j++){
		        System.out.print("*");
		    }
		    System.out.println();
		}
		for(int i=1;i<=n/2;i++){
		    for(int oo=1;oo<=i;oo++){
		        System.out.print(" ");
		    }
		    for(int j=1;j<=n-(2*i);j++){
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}
}



   *
  ***
 *****
*******
 *****
  ***
   *



