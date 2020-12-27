/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
		// selection sort;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++){
		    arr[i]=s.nextInt();
		    System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++){
		    int max=arr[i];int maxindex=i;
		    for(int j=i+1;j<arr.length;j++){
		        if(arr[j]>max){
		            max=arr[j];
		            maxindex=j;
		        }
		    }
		    int temp=arr[i];
		    arr[i]=arr[maxindex];
		    arr[maxindex]=temp;
		}
		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}
