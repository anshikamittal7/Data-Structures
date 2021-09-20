import java.util.*;

class GFG {
    public static boolean palindrome(String str){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=str.charAt((str.length()-1)-i)){
                return false;
            }
        }
        return true;
    }
	public static void main (String[] args) {
	    String newstr="";
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		System.out.println(palindrome(str));
	}
}
