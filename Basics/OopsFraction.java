import java.util.*;
class Fraction{
    int numerator;
    int denominator;
    public Fraction(int numerator,int denominator){
        this.numerator=numerator;
        this.denominator=denominator;
        simplify();
    }
    
    public void print(){
        System.out.println(numerator+"/"+denominator);
    }
    public void simplify(){
        int gdc=1;
        int i=Math.min(numerator,denominator);
        for(int k=2;k<=i;k++){
            if(numerator%k == 0 && denominator%k == 0){
                gdc=k;
            }
        }
        numerator=numerator/gdc;
        denominator=denominator/gdc;
    }
    public void increment(){
        numerator=numerator+denominator;
        simplify();
    }
    
    // public Fraction add(Fraction n1){
    //     Fraction sum = new Fraction(n1.numerator*denominator + n1.denominator*numerator , n1.denominator*denominator);
    //     return sum;
    // }
}

class FractionUses{
    public static Fraction sum(Fraction n1, Fraction n2){
        Fraction s=new Fraction(n1.numerator*n2.denominator + n1.denominator*n2.numerator , n1.denominator*n2.denominator);
        return s;
    }
    // public static int sum(int a,int b){
    //     int s=a+b;
    //     return s;
    // }
	public static void main (String[] args) {
	    Fraction f1=new Fraction(5,10);
	    Fraction f2=new Fraction(32,8);
	    Fraction f3=sum(f1,f2);
	    f3.print();
    }
}
