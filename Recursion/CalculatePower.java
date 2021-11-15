import java.util.*;

class GFG {
    public static double power(double n,double pow){
        if(pow==1) return n;
        if(pow==0) return 1;
        if(pow<0){
            return power(1/n,-pow);
        }
        double smallans = power(n*n,pow/2);
        if(pow%2==0){
            return smallans;
        }
        return smallans*n;
    }
	public static void main (String[] args) {
	    System.out.println(power(5,4));
	}
}
