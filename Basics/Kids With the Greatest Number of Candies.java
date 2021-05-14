/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		int candies[]={4,5,6,2,4};
		int extraCandies=2;
		//Boolean ans[]=new Boolean[candies.length];
		int max=candies[0];
		for(int i=0;i<candies.length;i++){
		    if (candies[i]>max){
		        max=candies[i];
		    }
		}
		for(int j=0;j<candies.length;j++){
		    if(max<=candies[j]+extraCandies) System.out.println(true);
		    else System.out.println(false);
		}
	}
}
