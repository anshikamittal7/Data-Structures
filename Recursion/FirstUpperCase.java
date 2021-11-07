import java.util.*;

class GFG {
    public static char FindUpperCase(String str, int i){
        if(i == str.length()){
            return '0';
        }
        if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
            return str.charAt(i);
        }
        return FindUpperCase(str,i+1);
    }
    
    
    
	public static void main (String[] args) {
		String str = "geeksForgeeks";
		System.out.println(FindUpperCase(str,0));
	}
}
