import java.util.*;

class GFG {
    public static void move(int[] arr,int i){
        for(i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[j-1]>=0 && arr[j]<0 ){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
    }
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0){
		    int arr[]=new int[s.nextInt()];
		    for(int i=0;i<arr.length;i++){
		        arr[i]=s.nextInt();
		    }
		    move(arr,0);
		}
	}
}

