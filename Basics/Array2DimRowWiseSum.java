import java.util.*;

class GFG {
    public static void sum(int arr[][]){
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[0].length;j++){
                sum+=arr[i][j];
            }
            System.out.print(sum+" ");
        }        
        System.out.println();
    }
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0){
		    int rows=s.nextInt();
    		int cols=s.nextInt();
    		int arr[][]=new int[rows][cols];
    		for(int i=0;i<arr.length;i++){
    		    for(int j=0;j<arr[0].length;j++){
    		        arr[i][j]=s.nextInt();
    		    }
    		}
    	
    		sum(arr);
		}
	}
}

