import java.util.*;

class GFG {
    public static void swap(int arr[],int l,int m){
        int temp = arr[l];
        arr[l] = arr[m];
        arr[m] = temp;
    }
    public static void selection(int arr[], int i, int j,int max){
        if(i==0){
            return;
        }
        if(i>j){
            if(arr[max]<arr[j]){
                max=j;
                selection(arr,i,j+1,max);
            }
            else{
                selection(arr,i,j+1,max);
            }
        }else{
            swap(arr,max,i-1);
            selection(arr,i-1,0,0);
        }
    }
	public static void main (String[] args) {
	    int arr[]={3,5,1,2,1,8,9,5,4,2,4,5,1,4,2,89,32,11,5,22,0,-21,-90,54};
	    System.out.println(Arrays.toString(arr));
	    selection(arr,arr.length,0,0);
	    System.out.println(Arrays.toString(arr));
	}
}
