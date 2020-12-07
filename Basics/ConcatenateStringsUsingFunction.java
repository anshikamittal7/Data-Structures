
import java.util.*;

class GFG {
	public static void main (String[] args) {
	Scanner s=new Scanner(System.in);
	String s1=s.nextLine();
	String s2=s.nextLine();
    String ans=stringConcatination(s1,s2);
    System.out.println(ans);
	}
	public static String stringConcatination(String s1,String s2){
	    String s3=s1+s2;
	    System.out.println(s3);
	   return s3;
	}
	
	
}
