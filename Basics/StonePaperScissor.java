/*package whatever //do not write package name here */

import java.util.*;
//import java.util.random;

class GFG {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		Random r=new Random();
		int myscore =0;
		int compscore=0;
		int i=s.nextInt();
		while(i!=0){
		System.out.println("press 0 for rock\npress 1 for paper\npress 2 for scissor");
		int option=s.nextInt();
		int randomnum=r.nextInt(3);
		System.out.println("your choice: "+option);
		System.out.println("computer's choice:  "+randomnum);
		if(option==randomnum)System.out.println("tie");
		else if((option==0&&randomnum==2) || (option==1&&randomnum==0) ||(option==2&&randomnum==1)){
		    System.out.println("you won!!");
		    myscore++;
		}else {
		    System.out.println("computer won!!");
		    compscore++;
		}
		i--;
		
		}
		System.out.println("my score: "+myscore);
		System.out.println("computer's score: "+compscore);
		if (myscore>compscore){
		    System.out.println("Winner is Anshika");
		}else if (myscore<compscore) System.out.println("You lost!");
		else System.out.println("draw");
	}
}
