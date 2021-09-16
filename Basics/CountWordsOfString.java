import java.util.*;

class GFG {
    // public static int count(String str){
    //     int count=1;
    //     for(int i=0;i<str.length();i++){
    //         if(str.charAt(i)==' ') count++;
    //     }
    //     return count;
    // }
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int c=0;
		while(s.hasNext()){
		    s.next();
		    c++;
		}
		System.out.println(c);
	}
}


// input:
// abc def 

// output:
// 2
