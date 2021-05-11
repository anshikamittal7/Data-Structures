/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		float n2=0.0f;
		//int n2=s.nextInt();
        //int n3=s.nextInt();
        if (n1<250000){
            System.out.println("tax paid Rs.0");
        }else if(n1>=250000&&n1<=500000){
            n2=(n1*5/100);
        }else if(n1>=500000&&n1<=1000000){
            n2=(n1*20/100);
        }else{
            n2=(n1*30/100);
        }
        System.out.println("tax paid Rs."+n2);
        
	}
}
