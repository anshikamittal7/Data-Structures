/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		int ar[]=new int[n];
		for(int i=0;i<arr.length;i++){
		    arr[i]=s.nextInt();
		}
		for(int j=0;j<arr.length;j++){
		    ar[j]=arr[arr[j]];
		    //System.out.print(ar[j]+" ");
		}
		for(int k=0;k<arr.length;k++){
		   System.out.print(ar[k]+" ");
		}
	}
}
