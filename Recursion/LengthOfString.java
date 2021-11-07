import java.util.*;

class GFG {
    public static int LengthOfString(String str){
        if(str.isEmpty()){
            return 0;
        }
        return 1+LengthOfString(str.substring(1));
    }
    
	public static void main (String[] args) {
	    String str = "anshika";
		System.out.println(LengthOfString(str));
	}
}
