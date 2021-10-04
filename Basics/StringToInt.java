import java.util.*;

class GFG {
    public static int removex(String str,int i){
        if(i<0) return 0;
        return removex(str,i-1)*10+((int)str.charAt(i)-'0');
    }
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0){
		    String str=s.next();
		    System.out.println(removex(str,str.length()-1));
		}
	}
}
