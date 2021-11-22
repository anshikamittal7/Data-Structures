import java.util.*;

class GFG {
    public static String removeS(String str, String c){
        if(str.length()==0) return "";
        if(str.startsWith(c)){
            return removeS(str.substring(c.length()),c);
        }
        else{
            return str.charAt(0)+removeS(str.substring(1),c);
        }
    }
	public static void main (String[] args) {
	   String str = "heheythere";
	   System.out.println(removeS(str,"re"));
	}
}
