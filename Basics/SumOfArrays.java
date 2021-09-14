import java.util.*;
class GFG {
    public static void sum(int arr1[],int arr2[]){
        int temp=arr1.length;
        if(arr2.length>arr1.length) temp=arr2.length; 
        int ans[]=new int[temp];
        int p=0,q=0,r=0;
        while(p<arr1.length && q<arr2.length){
            ans[r]=arr1[p]+arr2[q];
            p++;q++;r++;
        }
        while(p<arr1.length){
            ans[r]=arr1[p];
            p++;r++;
        }
        while(q<arr2.length){
            ans[r]=arr2[q];
            r++;q++;
        }
        for(int k=0;k<ans.length;k++) System.out.print(" "+ ans[k]);
            System.out.println();
    }
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int arr1[]=new int[n1];
		for(int i=0;i<arr1.length;i++){
		    arr1[i]=s.nextInt();
		    System.out.print(" "+ arr1[i]);
		}
		System.out.println();
		int n2=s.nextInt();
		int arr2[]=new int[n2];
		for(int j=0;j<arr2.length;j++){
		    arr2[j]=s.nextInt();
		    System.out.print(" "+ arr2[j]);
		}
		System.out.println();
		sum(arr1,arr2);
	}
}


ooooooooooooooorrrrrrrrrrrrr



import java.util.*;
class GFG {
    public static void sum(int arr1[],int arr2[]){
        int a=arr1.length,b=arr2.length;
        int ans[]=new int[(a>b)?a:b];
        int i=0;int j=0;
        while(i<arr1.length){
            ans[i]+=arr1[i];
            i++;
        }
        while(j<arr2.length){
            ans[j]+=arr2[j];
            j++;
        }
        for(int k=0;k<ans.length;k++) System.out.print(" "+ ans[k]);
            System.out.println();
    }
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int arr1[]=new int[n1];
		for(int i=0;i<arr1.length;i++){
		    arr1[i]=s.nextInt();
		    System.out.print(" "+ arr1[i]);
		}
		System.out.println();
		int n2=s.nextInt();
		int arr2[]=new int[n2];
		for(int j=0;j<arr2.length;j++){
		    arr2[j]=s.nextInt();
		    System.out.print(" "+ arr2[j]);
		}
		System.out.println();
		sum(arr1,arr2);
	}
}



input:
5
3 4 1 2 6
4
1 2 3 4
output:
3 4 1 2 6
1 2 3 4
4 6 4 6 6
