/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		switch (n1){
		   case 1:
		     System.out.println("monday");
		     break;
		   case 2:
		    System.out.println("tues");
		    break;
		   case 3:
		    System.out.println("wed");
		    break;
		    case 4:
		    System.out.println("thur"); 
		    break;
		     case 5:
		    System.out.println("friday"); 
		    break;
		    case 6:
		    System.out.println("sat"); 
		    break;
		    case 7:
		    System.out.println("sun"); 
		    break;
		    default:
		    System.out.println("error!!");
		}
	}
}
