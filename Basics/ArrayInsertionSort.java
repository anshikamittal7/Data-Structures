import java.util.*;
class GFG {
    public static void isort(int arr[]) {
        for(int i=0;i<arr.length-1;i++){
            int temp=i;
            while(temp>=0 && arr[temp+1]<arr[temp]){
                int temp2=arr[temp];
                arr[temp]=arr[temp+1];
                arr[temp+1]=temp2;
                temp--;
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
    		isort(arr);
    		for(int i=0;i<arr.length;i++){
    		    System.out.print(arr[i]+" ");
    		}
    		System.out.println();
		}
		
	}
}
