/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++){
		    arr[i]=s.nextInt();
		}
		int ans=0;
		for(int i=0;i<arr.length;i++){
		    //boolean ans=true;
		    
		    ans^=arr[i];
		  //  for(int j=0;j<arr.length;j++){
		  //      if(arr[i]==arr[j] && i!=j){
		  //          ans=false;
		  //          break;
		  //      }
		  //  }
		  //  if(ans==true){
		  //      System.out.println(arr[i]);
		  //  }
		}
		System.out.println(ans);
	}
}
