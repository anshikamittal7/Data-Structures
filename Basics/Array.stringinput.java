/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
	    String arr[]=new String[10];
	    Scanner s=new Scanner(System.in);
	    for (int i=0;i<arr.length;i++){
	        arr[i]=s.nextLine();
	        System.out.println(arr[i]);
	    }
	    String ans="no";
	    for (int j=0;j<arr.length;j++){
	        
	        if (arr[j].equals("sikkim")){
	            ans="state exists in INDIA";
	            break;
	        }
	    }
	    System.out.println(ans);
	}
}
