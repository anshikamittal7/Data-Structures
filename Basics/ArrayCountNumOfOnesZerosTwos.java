/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
	    int arr[]=new int[10];
	    Scanner s=new Scanner(System.in);
	    int count=0;
	    for (int i=0;i<arr.length;i++){
	        arr[i]=s.nextInt();
	        if (arr[i]==0){
	            count=count+1;
	        }
	    } 
	    int count1=0;
	    for (int j=0;j<arr.length;j++){
	       
	        if (arr[j]==1){
	            count1=count1+1;
	        }
	    }
	     int count2=0;
	    for (int k=0;k<arr.length;k++){
	        
	        if (arr[k]==2){
	            count2=count2+1;
	        }
	    }
	    System.out.println(count);
	    System.out.println(count1);
	    System.out.println(count2);
	}
}
