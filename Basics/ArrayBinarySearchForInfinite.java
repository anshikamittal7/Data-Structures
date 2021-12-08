/*package whatever //do not write package name here */

import java.util.*;

class GFG {
    public static int binarySearch(int arr[], int low, int high, int x){
        int mid = (low+high)/2;
        if(low<=high){
            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]<x){
                return binarySearch(arr, mid+1, high, x);
            }
            return binarySearch(arr, low, mid-1, x);
        }
        return -1;
    }
    public static int findlowhigh(int arr[], int x){
        int low = 0;
        int high = 1;
        while(arr[high]<x){
            low = high;
            if(2*high<arr.length-1){
                high= high*2;
            }
            else{
                high = arr.length-1;
            }
        }
        return binarySearch(arr, low, high, x);
    }
	public static void main (String[] args) {
		int arr[] = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
		System.out.println(findlowhigh(arr, 11));
	}
}
