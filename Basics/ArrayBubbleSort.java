import java.util.*;
class GFG {
    public static void bsort(int arr[]) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }		
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
	    int t=s.nextInt();
		while(t--!=0){
		    int n=s.nextInt();	    
		    int arr[]=new int[n];
    		for(int i=0;i<arr.length;i++){
    		    arr[i]=s.nextInt();
    		}
    		bsort(arr);
    		for(int i=0;i<arr.length;i++){
    		    System.out.print(arr[i]+" ");
    		}
    		System.out.println();
		}
		
	}
}
