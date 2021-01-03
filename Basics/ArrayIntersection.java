/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
		int ar1[]={3,5,2};
		int ar2[]={9,1,3,2};
		for(int i=0;i<ar1.length;i++){
		    for(int j=0;j<ar2.length;j++){
		        if(ar1[i]==ar2[j]){
		            System.out.println(ar2[j]);
		            ar2[j]=Integer.MIN_VALUE;
		        }
		    }
		}
	}
}
