import java.util.*;

class GFG {
    public static String star(String str,int i){
        if(i==str.length()) return "";
        if(i+1<str.length() && (str.charAt(i)==str.charAt(i+1))){
            return str.charAt(i)+"*"+star(str,i+1);
        }
        return str.charAt(i)+star(str,i+1);
    }
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0){
		    String str=s.next();
		    System.out.println(star(str,0));
		}
	}
}

// input:
// 3
// aaaa
// hello
// pigga

// output:
// a*a*a*a
// hel*lo
// pig*ga
