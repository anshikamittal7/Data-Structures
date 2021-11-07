import java.util.*;

class GFG {
    public static String ReverseString(String str, int i){
        if(str.length() == i) return "";
        String ans = ReverseString(str,i+1);
        ans += str.charAt(i);
        return ans;
    }
    
	public static void main (String[] args) {
		String str = "geeksForgeeks";
		System.out.println(ReverseString(str,0));
	}
}
