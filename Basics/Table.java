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
	        System.out.print(n1 + "*" + i + "="+ n1*i+" ");
		System.out.print(n2 + "*" + i + "="+ n2*i+" ");
		System.out.print(n3 + "*" + i + "="+ n3*i+" ");
	}
		System.out.println();
}
