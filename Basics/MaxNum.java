/*package whatever //do not write package name here */

import java.util.*;

class GFG {
    public static int max(int n,int k){
        for(int j=1;j<=k;j++){
            int i=1;int ans=0;
            int temp=ans;
            while(n/i!=0){
                temp=(n/(i*10)*i)+(n%i);
                ans=Math.max(ans,temp);
                i*=10;
            }
            n=ans;
        }
        return n;
        
    }
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		System.out.println(max(n,k));
	}
}

https://www.geeksforgeeks.org/largest-number-possible-after-removal-of-k-digits/
