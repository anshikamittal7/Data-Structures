import java.util.*;

class GFG {
    public static void merge(int arr[],int l,int mid,int r){
        int i=l,j=mid+1,k=0;
        int ans[]=new int[r-l+1];
        while(i<=mid && j<=r){
            if(arr[i]<arr[j]){
                ans[k++]=arr[i++];
            }
            else{
                ans[k++]=arr[j++];
            }
        }
        while(i<=mid){
            ans[k++]=arr[i++];
        }
        while(j<=r){
            ans[k++]=arr[j++];
        }
        
        for(int p=l,q=0;p<=r;p++,q++){
            arr[p]=ans[q];
        }
        
    }
    public static void mergesort(int arr[],int l,int r){
        int mid=(l+r)/2;
        if(l<r){
            mergesort(arr,l,mid);
            mergesort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }
    
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0){
		    int n=s.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<arr.length;i++){
                arr[i]=s.nextInt();
            }
            mergesort(arr,0,arr.length-1);
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
		    System.out.println();
		}
	}
}
