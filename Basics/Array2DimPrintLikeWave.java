import java.util.*;

class GFG {
    
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0){
    		int arr[][]=new int[s.nextInt()][s.nextInt()];
    		for(int i=0;i<arr.length;i++){
    		    for(int j=0;j<arr[0].length;j++){
    		        arr[i][j]=s.nextInt();
    		    }
    		}
    		int j=0;
    		while(j<arr[0].length){
    		    if(j%2==0){
    		        for(int i=0;i<arr.length;i++){
            		    System.out.print(arr[i][j]+" ");
            		}
            		j++;
    		    }
    		    else{
    		        for(int i=arr.length-1;i>=0;i--){
            		    System.out.print(arr[i][j]+" ");
            		}
            		j++;
    		    } 
    		    
    		}
    		System.out.println();
		}	
	}
}

// input
// 3
// 3 4 
// 1  2  3  4 
// 5  6  7  8 
// 9 10 11 12

// 5 3 
// 1 2 3 
// 4 5 6 
// 7 8 9 
// 10 11 12 
// 13 14 15
// 3 3
// 10 20 30 
// 40 50 60
// 70 80 90
//   output
// 1 5 9 10 6 2 3 7 11 12 8 4 
// 1 4 7 10 13 14 11 8 5 2 3 6 9 12 15 
// 10 40 70 80 50 20 30 60 90
