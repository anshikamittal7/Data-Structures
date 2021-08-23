
import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();int temp=n;int sum=0;int i=0;
		while(temp!=0){
		    int r=temp%10;
		    temp=temp/10;
		    if(r==1){
		        sum+=Math.pow(2,i);
		    }
		    i++;
		}
		System.out.println(sum);
	}	
}
