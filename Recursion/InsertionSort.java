import java.util.*;

class GFG {
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void InsertionSort(int arr[], int i){
        if(i == arr.length) return;
        int j = i-1;
        int k = arr[i];
        while(j>=0 && arr[j]>k){
            swap(arr, j, j+1);
            j--;
        }
        InsertionSort(arr, i+1);
    }
    
	public static void main (String[] args) {
	    int arr[] = {3,8,1,2,0,9};
	    InsertionSort(arr,0);
		System.out.println(Arrays.toString(arr));
	}
}
