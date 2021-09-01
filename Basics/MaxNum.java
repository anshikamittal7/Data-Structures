/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int arr[]=new int[4];int i=3;
		int ans=0;int index=0;
		int n=s.nextInt();
		while(n!=0){
		    int rem=n%10;
		    n=n/10;
		    arr[i]=rem;i--;
		}
		
		int min=arr[0];
		for(int k=0;k<arr.length;k++){
		    if(arr[k]<min){
		        min=arr[k];
		        index=k;
		    }
		}
		for(int l=0;l<arr.length;l++){
		    if(l!=index){
		        ans=ans*10+arr[l];
		    }
		}
		System.out.println(ans);
		
	}
}


https://www.geeksforgeeks.org/largest-number-possible-after-removal-of-k-digits/
