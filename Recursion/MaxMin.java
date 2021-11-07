import java.util.*;

class GFG {
    public static int FindMin(int arr[], int i){
        if(i == arr.length){
            return Integer.MAX_VALUE;
        }
        return Math.min(arr[i],FindMin(arr,i+1));
    }
    
    public static int FindMax(int arr[], int i){
        if(i == arr.length){
            return Integer.MIN_VALUE;
        }
        return Math.max(arr[i],FindMax(arr,i+1));
    }
    
	public static void main (String[] args) {
		int arr[]={3, 4, 5};
		System.out.println(FindMin(arr,0));
		System.out.println(FindMax(arr,0));
	}
}
