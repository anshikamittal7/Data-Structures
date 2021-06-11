/*package whatever //do not write package name here */

import java.util.*;
import java.util.Random;
class game{
    int rn,num,nguess;
    Scanner s=new Scanner(System.in);
    public game(){
        Random r=new Random();
        rn=r.nextInt(10);
    }
    public void userinput(){
        num=s.nextInt();
    }
    public boolean iscrctnum(){
        if(num==rn) return true;
        return false;
    }
    public void setter(int g){
        nguess=g;
    }
    public int getter(){
        return nguess;
    }
}
class GFG {
	public static void main (String[] args) {
		game round=new game();
		round.setter(10);
		int m=round.getter();
		int i=0;
		while(i++<m){
		    round.userinput();
		    if (round.iscrctnum()==true){
		        System.out.println(i+" accepted");
		    }else System.out.println("not accepted"); 
		}
	}
}
