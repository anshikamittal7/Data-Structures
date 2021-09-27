import java.util.*;

class GFG {
    public static void rotate(int arr[],int n){
        int arr1[]=new int[n];
        int arr2[]=new int[arr.length - n];
        for(int i=0;i<n;i++){
            arr1[i]=arr[i];
        }
        for(int j=n;j<arr.length;j++){
            arr2[j-n]=arr[j];
        }
        int i=0,j=0;
        while(i<arr2.length){
            arr[i]=arr2[i++];
        }
        while(j<arr1.length){
            arr[i++]=arr1[j++];
        }
    }
	public static void main (String[] args) {
	    Scanner s=new Scanner(System.in);
	    int t=s.nextInt();
	    while(t--!=0){
	        int num=s.nextInt();
	        int n=s.nextInt();
	        int arr[]=new int[num];
    		for(int i=0;i<arr.length;i++){
    		    arr[i]=s.nextInt();
    		}
    		
    		rotate(arr,n);
    		for(int k=0;k<arr.length;k++){
    		    System.out.print(arr[k]+" ");
    		}
    		System.out.println();
	    }	
	}
}
