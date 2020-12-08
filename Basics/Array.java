import java.io.*;

class GFG {
	public static void main (String[] args) {
		System.out.println("GfG!");
		int arr[]=new int[6];
		arr[0]=100;
		arr[3]=500;
		arr[5]=800;
		if (arr[3]==arr[5]){
		    System.out.println("equal");
		}else{
		    System.out.println("not equal");
		}
		arr[4]=arr[3]+arr[0];
		arr[2]=arr[3]/arr[0];
		System.out.println(arr[4]+" "+arr[2]);
		for(int i=0;i<arr.length;i++){
		    System.out.println(arr[i]);
		}
		
		int sum=0;
	    for (int j=0;j<arr.length;j++){
	        sum=sum+arr[j];
	        
	    }
		System.out.println(sum);
		
		
		
	
	}
}
