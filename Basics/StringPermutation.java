import java.util.*;

class GFG {
    public static boolean per(String str,String str2){
        if(str.length()!= str2.length()) return false;
        int c=0;
        for(int i=0;i<str.length();i++){
            c^=str.charAt(i)^str2.charAt(i);
        }
        if(c==0) return true;
        return false;
    }
	public static void main (String[] args) {
	    Scanner s=new Scanner(System.in);
		String str=s.next();
		String str2=s.next();
		System.out.println(per(str,str2));	
	}
}
