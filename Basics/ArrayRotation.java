/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++){
		    arr[i]=s.nextInt();
		    System.out.print(arr[i]+" ");
		}
		System.out.println();
		int k=3;
		while(k!=0){
		    int temp=arr[0];
		    for(int i=0;i<arr.length-1;i++){
		        arr[i]=arr[i+1];
		        
		    }
		    arr[arr.length-1]=temp;
		    k--;
		}
		for(int i=0;i<arr.length;i++){
		    
		    System.out.print(arr[i]+" ");
		}
	
	}
}
