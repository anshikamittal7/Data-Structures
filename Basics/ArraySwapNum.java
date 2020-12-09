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
