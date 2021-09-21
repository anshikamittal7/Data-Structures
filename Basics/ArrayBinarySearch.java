import java.util.*;

class GFG {
    public static int binarysearch(int arr[],int num){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(num>arr[mid]) start=mid+1;
            else if(num<arr[mid]) end=mid-1;
            else return mid;
        }
        return -1;
    }
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0){
		    int arr[]=new int[s.nextInt()];
    		for(int i=0;i<arr.length;i++){
    		    arr[i]=s.nextInt();
    		}
    		int num=s.nextInt();
    		System.out.print("number exist at the index: ");
    		System.out.println(binarysearch(arr,num));
		}
		
	}
}
