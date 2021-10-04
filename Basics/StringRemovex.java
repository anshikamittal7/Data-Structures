import java.util.*;

class GFG {
    public static String removex(String str,int i){
        if(i==str.length()) return "";
        
        if(str.charAt(i)=='x'){
            return removex(str,i+1);
        }
        return str.charAt(i)+removex(str,i+1);
        
    }
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0){
		    String str=s.next();
		    System.out.println(removex(str,0));
		}
	}
}
