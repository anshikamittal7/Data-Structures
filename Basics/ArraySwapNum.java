import java.io.*;

class GFG {
	public static void main (String[] args) {
		int arr[]={1,2,3,4,5,6};
		int i=0;
		int j=1;
		while(i<arr.length-2 && j<arr.length-1){
		    arr[i]=arr[i] +arr[j];
		    arr[j]=arr[i] -arr[j];
		    arr[i]=arr[i] -arr[j];
		    i=i+2;
		    j=j+2;
		}
		int k=0;
		while(k<arr.length){
		    System.out.println(arr[k]);
		    k++;
		}
	}
}


import java.io.*;

class GFG {
	public static void main (String[] args) {
		int arr[]={1,2,3,4,5,6};
		int i=0;
		while(i<arr.length-2 ){
		    int temp=arr[i];
		    arr[i]=arr[i+1];
		    arr[i+1]=temp;
		    i=i+2;
		}
		int k=0;
		while(k<arr.length){
		    System.out.println(arr[k]);
		    k++;
		}
	}
}

/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
	    int arr[]=new int[6];
	    Scanner s=new Scanner(System.in);
	    for (int i=0;i<arr.length;i++){
	        arr[i]=s.nextInt();
	        System.out.print(arr[i]+" ");
	   }
	   System.out.println();
	   for (int j=0;j<arr.length-1;j=j+2){
	       int temp=arr[j];
	       arr[j]=arr[j+1];
	       arr[j+1]=temp;
	       //System.out.print(arr[j]+" "+arr[j+1]+" ");
	   }
		for (int k=0;k<arr.length;k++){
	       System.out.print(arr[k]+" ");
	   }
	}
}
