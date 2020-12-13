import java.util.*;

class GFG {
	public static void main (String[] args) {
	    int arr[]={1,2,34,5,67};
	    Scanner s=new Scanner(System.in);
	    int num=s.nextInt();
	    int i=0;
	    String pos="no";
	    while(i<arr.length){
	        if (arr[i]==num){
	            pos="yes";
	        }
	        i++;
	    }
	    System.out.println(pos);
	}
}
/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
		int arr[]=new int[5];
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		String ans="no";
		for(int i=0;i<arr.length;i++){
		    arr[i]=s.nextInt();
		    if (arr[i]==num){
		        ans="yes";
		        
		    }
		}
		System.out.println(ans);
	}
}
