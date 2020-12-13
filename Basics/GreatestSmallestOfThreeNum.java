import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if (a>=b && a>=c){
		    System.out.println("a is greatest");
		}else if(b>=a && b>=c){
		    System.out.println("b is greatest");
		}else{
		    System.out.println("c is greatest");
		}
		
	}
}
/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
		System.out.println("GfG!");
		
		Scanner s= new Scanner(System.in);
		int num1=s.nextInt();
		int num2=s.nextInt();
		int num3=s.nextInt();
		if (num1 <= num2 && num1 <= num3){
		    System.out.println(num1 + "is smallest");
		}else if (num2 <= num1 && num2 <= num3){
		    System.out.println(num2 +"is smallest");
		}else {
		    System.out.println(num3 +"is smallest");
		}	
		
	}
}
