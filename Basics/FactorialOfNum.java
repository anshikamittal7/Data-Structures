import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner s =new Scanner(System.in);
		int num=s.nextInt();
		int fac=1;
		for (int i=num;i>=1;i=i-1){
		    fac=fac*i;
		    if (num==0){
		        fac=1;
		    }
		}
		System.out.println(fac);
	}
}
