/*package whatever //do not write package name here */

import java.util.*;
class GFG {
	public static void main (String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int arr[]=new int[n];
	    int count=0;
	    int count1=0;
	    int count2=0;
	    for(int j=0;j<arr.length;j++){
	        arr[j]=s.nextInt();
	        if (arr[j]==0){
	            count++;
	        }else if(arr[j]==1){
	            count1++;
	        }else{
	            count2++;
	        }
	    }
	    int i=0;
	    while(count !=0){
	        arr[i]=0;
	        i++;
	        count--;
	    }
	    while(count1 !=0){
	        arr[i]=1;
	        i++;
	        count1--;
	    }
	    while(count2 !=0){
	        arr[i]=2;
	        i++;
	        count2--;
	    }
	    for (int k=0;k<arr.length;k++){
	        System.out.println(arr[k]);
	    }
	}
}
