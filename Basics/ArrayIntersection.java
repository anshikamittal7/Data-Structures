import java.util.*;

class GFG {
    public static void common(int arr1[],int arr2[]){
        
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+" ");
                    arr2[j]=Integer.MAX_VALUE;
                    break;
                }
            }
        }
        System.out.println();
    }
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0){
		    int n1=s.nextInt();
		    int arr1[]=new int[n1];
		    for(int i=0;i<arr1.length;i++){
		        arr1[i]=s.nextInt();
		    }
		    int n2=s.nextInt();
		    int arr2[]=new int[n2];
		    for(int i=0;i<arr2.length;i++){
		        arr2[i]=s.nextInt();
		    }
		    common(arr1,arr2);
		}
	}
}

oooooooooooorrrrrrrrrrrrrrr

import java.util.*;

class GFG {
    public static void sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                int temp=arr[i];
                if(arr[i]>arr[j]){
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void intersection(int arr1[],int arr2[]){
        int i=0;int j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]>arr2[j]) j++;
            else if(arr2[j]>arr1[i]) i++;
            else {
                System.out.print(arr1[i]+" ");
                i++;j++;   
            }
        }
    }
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0){
		    int arr1[]=new int[s.nextInt()];
		    for(int i=0;i<arr1.length;i++) arr1[i]=s.nextInt();
		    int arr2[]=new int[s.nextInt()];
		    for(int i=0;i<arr2.length;i++) arr2[i]=s.nextInt();
		    sort(arr1);sort(arr2);
		    intersection(arr1,arr2);
		}
	}
}


// sample input:
// 2
// 5
// 1 2 3 5 7
// 6
// 1 5 9 0 3 4 
// 4
// 1 2 2 2
// 3
// 2 3 2

// output:
// 1 3 5 
// 2 2 
