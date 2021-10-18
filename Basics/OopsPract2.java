import java.util.*;

class CN{
    int real;
    int imaginary;
    public CN(int real, int imaginary){
        this.real=real;
        this.imaginary=imaginary;
    } 
    
    public void print(){
        if(this.imaginary>=0) System.out.println(real+" + "+imaginary+"i");
        else System.out.println(real+" - "+ -imaginary+"i");
    }
    public static CN sum(CN n1, CN n2){
        CN n3=new CN(n1.real +n2.real, n1.imaginary+n2.imaginary);
        return n3;
    }
    public static CN product(CN n1,CN n2){
        CN n3= new CN(n1.real*n2.real-n1.imaginary*n2.imaginary, n1.imaginary*n2.real +n1.real*n2.imaginary );
        return n3;
    }
}

class GFG {
    
	public static void main (String[] args) {
		CN n1=new CN(2,1);
		n1.print();
		
		CN n2=new CN(3,-5);
		n2.print();
		
		CN n3=CN.sum(n1,n2);
		n3.print();
		
		CN n4=CN.product(n1,n2);
		n4.print();
	}
}
