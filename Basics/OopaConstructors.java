/*package whatever //do not write package name here */

import java.io.*;
class employee{
    int age;String name;
    public employee(String nameE,int ageE){
        name=nameE;age=ageE;
    }
    public void getdata(){
        System.out.println(name);
        System.out.println(age);
    }
    public employee(){
        name="TUSHAR";
        age=10;
    }
    public employee(String nameE){
        name=nameE;
        age=1;
    }
}
class GFG {
	public static void main (String[] args) {
	    employee pigga=new employee("tushar",18);
	    pigga.getdata();
	    
	    employee peggy=new employee("anshika",19);
	    peggy.getdata();
	    
	    employee abc=new employee("ANSHIKA");
	    abc.getdata();
	    
	    employee dek=new employee();
	    dek.name="anshi";
	    dek.getdata();
	}
}
