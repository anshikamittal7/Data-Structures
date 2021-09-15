import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		int count=0;
		for(int i=0;i<arr.length;i++){
		    arr[i]=s.nextInt();
		}
		int sum=s.nextInt();
		for(int p=0;p<arr.length;p++){
		    for(int j=p+1;j<arr.length;j++){
		        for(int k=j+1;k<arr.length;k++){
		            if(arr[j]+arr[k]+arr[p]==sum){
		                count++;
		                System.out.println(arr[p]+","+arr[j]+","+arr[k]);
		            }
		        }
		    }
		}
		System.out.println(count);
	}
}
input:
7
1 2 3 4 5 6 7 
12
output:	
1,4,7
1,5,6
2,3,7
2,4,6
3,4,5
5
