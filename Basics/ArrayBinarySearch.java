/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		int num=s.nextInt();
		int start=0;
		int end=arr.length-1;
		for (int i=0;i<arr.length;i++){
		    arr[i]=s.nextInt();
		}
		while(start<=end){
		    int mid=(end+1-start)/2;
		    if (arr[mid]==num){
		        System.out.println(mid);
		        break;
		    }else if(arr[mid]<num){
		        start=mid+1;
		    }else{
		        end=mid-1;
		    }
		}
	}
}
