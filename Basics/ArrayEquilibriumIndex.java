import java.util.*;

class GFG {
    public static int index(int arr[]){
        for(int i=0;i<arr.length;i++){
            int mid=i+1, j=0, k=mid+1, suma=0, sumb=0;
            while(j<mid){
                suma+=arr[j++];
            }
            while(k<arr.length){
                sumb+=arr[k++];
            }
            if(suma==sumb) return mid;
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
    		System.out.println(index(arr)); 
	    }	
	}
}
