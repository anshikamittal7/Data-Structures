import java.util.*;

class GFG {
    public static void revarr(int arr[]){
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
    }
    
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0){
		    int arr[]=new int[s.nextInt()];
    		for(int i=0;i<arr.length;i++){
    		    arr[i]=s.nextInt();
    		}
    		revarr(arr);
    		for(int j=0;j<arr.length;j++){
                System.out.print(arr[j]+" ");
            }
            System.out.println();
		}
		
	}
}
