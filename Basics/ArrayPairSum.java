/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=s.nextInt();
		int arr[]=new int[n];
		int count=0;
		for(int i=0;i<arr.length;i++){
		    arr[i]=s.nextInt();
		}
		for(int j=0;j<arr.length;j++){
		    for(int k=j+1;k<arr.length;k++){
		        if(arr[j]+arr[k]==sum){
		            count++;
		            System.out.println(arr[j]+","+arr[k]);
		        }
		    }
		}
		System.out.println(count);
	}
}
