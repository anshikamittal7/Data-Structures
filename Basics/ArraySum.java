import java.io.*;

class GFG {
	public static void main (String[] args) {
	    int arr[]={1,2,34,5,67};
	    int i=0;
	    int sum=0;
	    while(i<arr.length){
	        sum=sum+arr[i];
	        i++;
	    }
	    System.out.println(sum);
	}
}


/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
		int arr[]=new int[4];
		Scanner s=new Scanner(System.in);
		int sum=0;
		for(int i=0;i<arr.length;i++){
		    arr[i]=s.nextInt();
		    sum=sum+arr[i];
		}
		System.out.println(sum);
	}
}
