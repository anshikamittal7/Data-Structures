/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int SpecialFib(int a,int b,int n){
        if(n == 0){
            return a;
        }
        else if(n == 1){
            return b;
        }
        else if(n == 2){
            return a^b;
        }
        else{
            return SpecialFib(a, b, n%3);
        }
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- != 0){
		    int a = s.nextInt(), b = s.nextInt(),n = s.nextInt();
		    System.out.print(SpecialFib(a,b,n));
		    System.out.println();
		}
	}
}
