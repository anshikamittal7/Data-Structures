/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
		//armstrong Number
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int sum=0;
		int count=0;
		int temp=num;
		while(temp!=0){
		    int rem=temp%10;
		    temp=temp/10;
		    count++;
		}
		System.out.println(count);
		temp=num;
		while(temp!=0){
		    int rem=temp%10;
		    temp=temp/10;
		    sum=sum+(int)Math.pow(rem,count);
		}
		System.out.println(sum);
		temp=num;
		if (sum==temp){
		    System.out.println("Number is armstrong");
		}else{
		    System.out.println("Number is not armstrong");
		}
		
	}
}
