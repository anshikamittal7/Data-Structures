import java.util.*;

class GFG {
    public static void sum(int arr[][]){
        int ans1=0,c=-1;
        for(int i=0;i<arr[0].length;i++){
            int sumc=0;
            for(int j=0;j<arr.length;j++){
                sumc+=arr[j][i];
            }
            if(sumc>ans1){
                ans1=sumc;
                c=i;
            }
        }
        int ans2=0,rr=-1;
        for(int i=0;i<arr.length;i++){
            int sumr=0;
            for(int j=0;j<arr[0].length;j++){
                sumr+=arr[i][j];
            }
            if(sumr>ans2){
                ans2=sumr;
                rr=i;
            }
        }
        if(ans2>=ans1){
            System.out.printf("row %d %d",rr,ans2 );
        }
        else{
            System.out.printf("column %d %d",c,ans1 );
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

