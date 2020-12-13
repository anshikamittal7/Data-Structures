/*package whatever //do not write package name here */
import java.util.*;

class GFG {
	public static void main (String[] args) {
	    int arr[]=new int[8];
	    Scanner s=new Scanner(System.in);
	    int count=0;
	    int count1=0;
	    int count2=0;
	    for (int i=0;i<arr.length;i++){
	        arr[i]=s.nextInt();
	        if (arr[i]==0){
	            count=count+1;
	        }
	         if (arr[i]==1){
	            count1=count1+1;
	             
	         }
	       	        
	       	 if (arr[i]==2){
	            count2=count2+1;
	        }
	    }
	    System.out.println(count);
	    System.out.println(count1);
	    System.out.println(count2);
	}
  	    
}

