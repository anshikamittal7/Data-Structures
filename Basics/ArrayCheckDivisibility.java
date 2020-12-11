/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
		int arr[]=new int[4];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
		    arr[i]=s.nextInt();
		    //arr[i]=arr[i]*5;
		    System.out.println(arr[i]);
		}
		String chk="yes";
		for(int k=0;k<arr.length;k++){
		    if (arr[k]%5!=0){
		        chk="no";
		    }
		    
		}
		System.out.println(chk);
	
	}
}
