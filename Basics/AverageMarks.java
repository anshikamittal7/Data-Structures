import java.util.*;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
         Scanner s=new Scanner(System.in);
        String name=s.nextLine();
        int m1=s.nextInt();
        int m2=s.nextInt();
        int m3=s.nextInt();
        int sum=m1+m2+m3;
        System.out.println(name);
        System.out.println(sum/3);
        
    }
}
