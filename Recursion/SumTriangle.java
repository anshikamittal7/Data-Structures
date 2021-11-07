import java.util.*;

class GFG {
    public static void sumTriangle(int arr[]){
        if(arr.length<1) return ;
        int shortarr[] = new int[arr.length-1];
        for(int j=0; j<arr.length-1; j++){
            shortarr[j] = arr[j]+arr[j+1];
        }
        sumTriangle(shortarr);
        System.out.println(Arrays.toString(arr));
    }
	public static void main (String[] args) {
		int arr[]={1, 2, 3, 4, 5};
		sumTriangle(arr);
	}
}

[48]
[20, 28]
[8, 12, 16]
[3, 5, 7, 9]
[1, 2, 3, 4, 5]
