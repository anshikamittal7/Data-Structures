import java.util.*;

class GFG {
    public static void ssort(int arr[]) {
        for(int i=0;i<arr.length;i++){
            int index=i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[index]){
                    index=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
        
    }
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++){
		    arr[i]=s.nextInt();
		}
		ssort(arr);
		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}
