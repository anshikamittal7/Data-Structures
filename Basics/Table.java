import java.io.*;

class GFG {
	public static void main (String[] args) {
		int n1=25;
		int n2=50;
		int n3=29;
		table(n1,n2,n3);
		
	}
	public static void table(int n1,int n2,int n3){
	    int i=1;
	    while(i<=10){
	        System.out.println(n1 + "*" + i + "="+ n1*i);
	        i++;
	    }	   
	         int j=1;
	    while(j<=10){
	        System.out.println(n2+"*"+j+"="+n2*j);
	        j++;
	    }
	    int k=1;
	    while(k<=10){
	        System.out.println(n3+"*"+k+"="+n3*k);
	        k++;
	    }
	}
}
