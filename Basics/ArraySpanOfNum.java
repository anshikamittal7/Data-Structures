/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<arr.length;i++){
        arr[i]=s.nextInt();
    }
    int max=arr[0];
    for (int j=1;j<arr.length;j++){
        if (arr[j]>max){
            max=arr[j];
        }
    }
    int min=arr[0];
    for(int k=1;k<arr.length;k++){
        if (arr[k]<min){
            min=arr[k];
        }
    }
    System.out.println(max-min);
 }

}
