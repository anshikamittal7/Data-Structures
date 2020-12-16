/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		int sum=0;
		int avg=0;
		for(int i=0;i<arr.length;i++){
		    arr[i]=s.nextInt();
		    sum=sum+arr[i];
		}
		avg=sum/arr.length;
		System.out.println(avg);
	}
}
