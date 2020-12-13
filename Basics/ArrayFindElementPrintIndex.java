/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
	Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int a[]=new int[n];
   
    for (int i=0;i<a.length;i++){
        a[i]=s.nextInt();
    }
    int ans=-1;
    int d=s.nextInt();
    for (int j=0;j<a.length;j++){
        if (a[j]==d){
            ans=j;
            
        }
    }
    System.out.println(ans);
    
 }

}
