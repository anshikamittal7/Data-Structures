/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
		//second largest
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++){
		    arr[i]=s.nextInt();
		}
		int max=arr[0];
		for(int j=0;j<arr.length;j++){
		    if(arr[j]>max){
		        max=arr[j];
		    }
		}
		System.out.println(max);
		int smax=arr[0];
		for(int j=0;j<arr.length;j++){
		    if(arr[j]!=max && arr[j]>smax){
		        smax=arr[j];
		    }
		}
		System.out.println(smax);
	}
}
