import java.util.*;

class GFG {
    public static String removeSpecial(String str, String c, String special){
        if(str.length()==0) return "";
        if(str.startsWith(special)){
            return special+removeSpecial(str.substring(special.length()),c,special);
        }
        else if(str.startsWith(c)){
            return removeSpecial(str.substring(c.length()),c,special);
        }
        else{
            return str.charAt(0)+removeSpecial(str.substring(1),c,special);
        }
    }
	public static void main (String[] args) {
	   String str = "applehihelloapplicationapp";
	   System.out.println(removeSpecial(str,"app","apple"));
	}
}

/*output:
applehihellolication*/
