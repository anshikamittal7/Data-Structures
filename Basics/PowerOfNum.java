import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int x=s.nextInt();
		int ans=1;
		int i=1;
		while (i<=x){
		    ans=ans*n;
		    i=i+1;
		    if (n==0){
		    ans=1;
		    
		}if (x==0){
		    ans=1;
		}
	
		}
		System.out.println(ans);
	}
}


class Solution {
    public double power(double n,long pow){
        if(pow==0) return 1;
        if(n==0 && pow==0) return 1;
        if(n==0) return 0;
        if(pow<0){
            return power(1/n,-pow);
        }
        double ans=power    (n*n,pow/2);
        if(pow%2!=0){
            ans*=n;
        }return ans;
    }
    public double myPow(double x, int n) {
        return power(x,n);
    }
}
