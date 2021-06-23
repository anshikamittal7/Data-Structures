/*package whatever //do not write package name here */

import java.io.*;


class animal{
    String x;
    public void setterx(String x1){
        x=x1;
    }
    public String getterx(){
        return x;
    }
}
class pet extends animal{
    String y;
    public void settery(String y1){
        y=y1;
    }
    public String gettery(){
        return y;
    }
}

class GFG {
	public static void main (String[] args) {
	    animal a=new animal();
	    a.setterx("dog");
	    System.out.println(a.getterx());
	    pet p=new pet();
	    p.settery("piggy");
	    System.out.println(p.gettery());
	    p.setterx("piggy");
	    System.out.println(p.getterx());
	    
	}
}
