import java.util.*;

class GFG {
    
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0){
		    int row=s.nextInt();
		    int col=s.nextInt();
    		int arr[][]=new int[row][col];
    		for(int i=0;i<arr.length;i++){
    		    for(int j=0;j<arr[0].length;j++){
    		        arr[i][j]=s.nextInt();
    		    }
    		}
    		int rowstart=0, 
    		colstart=0, count=0, 
    		rowlength=arr.length, 
    		colslength=arr[0].length;
    		
    		while(count<row*col){
    		    for(int i=colstart;count<row*col && i<colslength;i++){
        		    System.out.print(arr[rowstart][i]+" ");
        		    count++;
        		}
        		rowstart++;
        		for(int i=rowstart ;count<row*col && i<rowlength; i++){
        		    System.out.print(arr[i][colslength-1]+" ");
        		    count++;
        		}
        		colslength--;
        		
        		for(int i=colslength-1;count<row*col && i>=colstart;i--){
        		    System.out.print(arr[rowlength-1][i]+" ");
        		    count++;
        		}
        		rowlength--;
        		
        		for(int i=rowlength-1;count<row*col && i>=rowstart;i--){
        		    System.out.print(arr[i][colstart]+" ");
        		    count++;
        		}
        		colstart++;
    		}
    		System.out.println();
		}	
	}
}

