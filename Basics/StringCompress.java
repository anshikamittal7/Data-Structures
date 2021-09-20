import java.util.*;
class GFG {
    public static StringBuffer count(StringBuffer str){
        StringBuffer strnew=new StringBuffer("");
        for(int i=0;i<str.length();i++){
            int count=1;
            char j=str.charAt(i);
            strnew.append(j);
            while(i<str.length()-1 && j==str.charAt(i+1)){
                count++;i++;
            }
            if(count>1) strnew.append(count);
        }
        return strnew;
    }
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0){
		    StringBuffer str=new StringBuffer(s.next());
        	System.out.println(count(str));
		}
	}	
}

// INPUT:
// 4
// aanshi
// xyzz
// aabcdd
// aaabccccd

// OUTPUT:
// a2nshi
// xyz2
// a2bcd2
// a3bc4d
