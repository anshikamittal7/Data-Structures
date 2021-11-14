import java.util.*;

class GFG {
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void bubbleSort(int arr[],int r,int c){
        if(r==0){
            return;
        }
        if(r>c){
            if(arr[c+1]<arr[c]){
                swap(arr,c,c+1);
            }
            bubbleSort(arr,r,c+1);
        }else{
            bubbleSort(arr,r-1,0);
        }
    } 
	public static void main (String[] args) {
	    int arr[]={3,5,1,2,1,8,9,5,4,2,4,5,1,4,2,89,32,11,5,22,0,-21,-90,54};
	    System.out.println(Arrays.toString(arr));
	    bubbleSort(arr,arr.length-1,0);
	    System.out.println(Arrays.toString(arr));
	}
}
