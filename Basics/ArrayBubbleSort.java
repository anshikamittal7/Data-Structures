/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
		//bubble sort
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int array[]=new int[n];
		for (int i=0;i<array.length;i++){
		    array[i]=s.nextInt();
		    System.out.print(array[i]+" ");
		}
		System.out.println();
		for (int j=0;j<array.length-1;j++){
		    for (int k=0;k<array.length-1;k++){
		        if (array[k]>array[k+1]){
		            int temp=array[k];
		            array[k]=array[k+1];
		            array[k+1]=temp;
		        }
		    }
		}
		for(int l=0;l<array.length;l++){
		    System.out.print(array[l]+" ");
		}
	}
}
