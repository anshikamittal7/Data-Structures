import java.util.*;

class GFG {
    public static int[] msort(int arr[],int arr2[]){
        int k=0, i=0,j=0;
        int ans[]=new int[arr.length+arr2.length];
        while(i<arr.length && j<arr2.length){
            if(arr[i]<arr2[j]  ){
                ans[k]=arr[i];
                i++;
            }
            else{
                ans[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<arr.length){
            ans[k]=arr[i];i++;k++;
        }
        while(j<arr2.length){
            ans[k]=arr2[j];j++;k++;
        }
        return ans;
    }
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0){
		    int arr[]=new int[s.nextInt()];
		    for(int i=0;i<arr.length;i++){
		        arr[i]=s.nextInt();
		    }
		    int arr2[]=new int[s.nextInt()];
		    for(int i=0;i<arr2.length;i++){
		        arr2[i]=s.nextInt();
		    }
		    
		    int ans[]=msort(arr,arr2);
		    for(int p=0;p<ans.length;p++){
		        System.out.print(ans[p]+" ");
		    }
		    System.out.println();
		}
	}
}
