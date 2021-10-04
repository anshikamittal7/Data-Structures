import java.util.*;

class GFG {
    public static String pi(String str,int i){
        if(i==str.length()) return "";
        
        if(str.charAt(i)=='p'&&str.charAt(i+1)=='i'){
            return "3.14"+pi(str,i+2);
        }
        return str.charAt(i)+pi(str,i+1);
        
    }
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0){
		    String str=s.next();
		    System.out.println(pi(str,0));
		}
	}
}
