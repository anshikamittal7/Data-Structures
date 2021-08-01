import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++){
		    for(int sp=1;sp<=(2*n)-(2*i);sp++){
		        System.out.print(" ");
		    }
		    for(int j=1;j<=i;j++){
		        System.out.print(i+j-1);
		    }
		    for(int k=i-1;k>=1;k--){
		        System.out.print(k+i-1);
		    }
		    System.out.println();
		}
	}
}

        1
      232
    34543
  4567654
567898765
