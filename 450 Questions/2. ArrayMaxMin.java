import java.util.*;

class GFG {
    public static void maxmin(int arr[]){
        int max=arr[0];int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]) max=arr[i];
            if(min>arr[i]) min=arr[i];
        }
        System.out.println("min: "+ min);
		System.out.println("max: "+max);
    }    
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int arr[]=new int[s.nextInt()];
		int newarr[]=new int[arr.length];
		for(int i=0;i<arr.length;i++){
		    arr[i]=s.nextInt();
		}
		maxmin(arr);
	}
}
