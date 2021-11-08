import java.util.*;

class GFG {
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void SelectionSort(int arr[], int i){
        if(i == arr.length) return;
        int k = i;
        int min = i;
        while(k < arr.length){
            if(arr[k]<arr[min]){
                min = k;
            }        
            k++;
        }
        swap(arr, i, min);
        SelectionSort(arr, i+1);
    }
    
	public static void main (String[] args) {
	    int arr[] = {3};
	    SelectionSort(arr,0);
		System.out.println(Arrays.toString(arr));
	}
}
