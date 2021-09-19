import java.util.*;

class GFG {
    public static StringBuffer removeDup(StringBuffer str){
        StringBuffer ans=new StringBuffer("");
        ans.append(str.charAt(0));
        for(int i=1;i<str.length()-1;i++){
            if(str.charAt(i)!=str.charAt(i+1)){
                ans.append(str.charAt(i+1));
            }
        }
        return ans;
    }
	public static void main (String[] args) {
	    Scanner s=new Scanner(System.in);
		StringBuffer str=new StringBuffer(s.next());
		System.out.println(removeDup(str));
	}
}
