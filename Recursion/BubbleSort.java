import java.util.*;

class GFG {
    public static void BubbleSort(int arr[], int i){
        if(i == arr.length){
            return;
        }
        for(int k=0; k<arr.length-i-1; k++){
            if(arr[k]>arr[k+1]){
                int temp = arr[k];
                arr[k] = arr[k+1];
                arr[k+1] = temp;
            }
        }
        BubbleSort(arr, i+1);
        
    }
    
	public static void main (String[] args) {
	    int arr[] = {3,8,1,2,0,9};
	    BubbleSort(arr,0);
		System.out.println(Arrays.toString(arr));
	}
}
