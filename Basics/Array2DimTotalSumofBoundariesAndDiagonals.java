import java.util.*;

class GFG {
    
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0){
		    int n=s.nextInt();
    		int arr[][]=new int[n][n];
    		for(int i=0;i<arr.length;i++){
    		    for(int j=0;j<arr[0].length;j++){
    		        arr[i][j]=s.nextInt();
    		    }
    		}
    		
    		int ans=0;
    		
    		if(n%2==0){
    		    //righ diag
    		    int k=1;
    		    while(k<n-1){
    		        ans+=arr[k][k];k++;
    		    }
    		    //vertical
        	    for(int i=0;i<n;i++){
    		        ans=ans+arr[i][0]+arr[i][n-1];
        		}
        		//horizontal
    		    for(int j=1;j<n-1;j++){
    		        ans=ans+arr[0][j]+arr[n-1][j];
        		}
        		//left diag
        		int p=n-2, q=1;
        		while(p>=1 && q<=n-2){
    		        ans+=arr[p][q];p--;q++;
    		    }
        		System.out.println(ans);
    		}
    		else{
    		    int k=1;
    		    while(k<n-1){
    		        ans+=arr[k][k];k++;
    		    }
    		    
        	    for(int i=0;i<n;i++){
    		        ans+=arr[i][0]+arr[i][n-1];
        		}
    		    for(int j=1;j<n-1;j++){
    		        ans+=arr[0][j]+arr[n-1][j];
        		}
        		int p=n-2, q=1;
        		while(p>=1 && q<=n-2){
    		        ans+=arr[p][q];p--;q++;
    		    }
        		System.out.println(ans-arr[(n-1)/2][(n-1)/2]);
    		}
		    
		}
	}
}

// sample input:
// 2
// 5
// 1 2 3 4 5
// 6 7 8 9 10
// 11 12 13 14 15
// 16 17 18 19 20
// 21 22 23 24 25
// 4
// 1 2 3 10
// 4 5 6 11
// 7 8 9 12
// 13 14 15 16
// sample output:
// 273
// 136
