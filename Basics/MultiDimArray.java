/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
		int arr[][]={{1,2,3},{4,5,6}};
		int arr2[][]={{4,5,6},{1,6,3}};
		int arr3[][]=new int[2][3];
		for(int i=0;i<arr.length;i++){
		    for(int j=0;j<arr[i].length;j++){
		        arr3[i][j]=arr[i][j]+arr2[i][j];
		    }
		}
		for(int k=0;k<arr3.length;k++){
		    for(int q=0;q<arr3[k].length;q++){
		    System.out.print(arr3[k][q]);
		    System.out.print(" ");
		}
		System.out.println("");
		}
		
	}
}
