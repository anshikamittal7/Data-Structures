/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		char c=s.next().charAt(0);
		c=(char)(c+8);
		System.out.println(c);
		c=(char)(c-8);
		System.out.println(c);
	}
}
