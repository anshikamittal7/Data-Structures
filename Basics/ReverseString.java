import java.util.*;

class GFG {
    public static void count(String str,String newstr){
        for(int i=str.length()-1;i>=0;i--){
            newstr+=str.charAt(i);
        }
        
            System.out.print(newstr);
        
    }
	public static void main (String[] args) {
	    String newstr="";
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		count(str,newstr);
	}
}
