import java.util.*;

class CN{
    int real;
    int complex;
    public CN(int real, int complex){
        this.real=real;
        this.complex=complex;
    } 
    
    public void print(){
        System.out.println(real+" + "+complex+"i");
    }
    public static CN sum(CN n1, CN n2){
        CN n3=new CN(n1.real +n2.real, n1.complex+n2.complex);
        return n3;
    }
    public static CN product(CN n1,CN n2){
        CN n3= new CN(n1.real*n2.real-n1.complex*n2.complex, n1.complex*n2.real +n1.real*n2.complex );
        return n3;
    }
}

class GFG {
    
	public static void main (String[] args) {
		CN n1=new CN(2,1);
		n1.print();
		
		CN n2=new CN(3,5);
		n2.print();
		
		CN n3=CN.sum(n1,n2);
		n3.print();
		
		CN n4=CN.product(n1,n2);
		n4.print();
	}
}
