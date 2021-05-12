/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		float income=s.nextFloat();
		float tax=0.0f;
		if (income <2.5){
		    tax+=0;
		}else if(income>=2.5&&income<5){
		    tax+=(income-2.5f)*0.05f;
		}else if(income>=5&&income<10){
		    tax+=(5f-2.5f)*0.05f;
		    tax+=(income-5f)*0.2f;
		}else if(income>=10){
		    tax+=(5f-2.5)*0.05f;
		    tax+=(10f-5f)*0.2f;
		    tax+=(income-10f)*0.3f;
		    
		}
		System.out.println("tax paid: Rs."+tax);
	}
}
