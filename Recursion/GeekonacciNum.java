/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int geekonacci (int a, int b, int c, int n){
        if(n == 1){
            return a;
        }
        else if(n == 2){
            return b;
        }
        else if(n == 3){
            return c;
        }
        else {
            return geekonacci(a,b,c,n-1)+geekonacci(a,b,c,n-2)+geekonacci(a,b,c,n-3);
        }
        
    }
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- != 0){
		    int a = s.nextInt(), b =s.nextInt(), c = s.nextInt(), n = s.nextInt();
		    System.out.println(geekonacci(a,b,c,n));
		}
	}
}
