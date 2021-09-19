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


or


import java.util.*;

class GFG {
    public static StringBuffer sort(StringBuffer str){
        for(int i=0;i<str.length();i++){
            char temp=str.charAt(i);
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)>str.charAt(j)){
                    str.setCharAt(i,str.charAt(j));
                    str.setCharAt(j,temp);
                }    
            }
        }
        return str;
    }
	public static void main (String[] args) {
	    Scanner s=new Scanner(System.in);
		StringBuffer str=new StringBuffer(s.next());
		StringBuffer str2=new StringBuffer(s.next());
		System.out.println(sort(str));
		System.out.println(sort(str2));
		
		if(sort(str).toString().equals(sort(str2).toString())){
		    System.out.println(true);
		}else{
		    System.out.println(false);
		}
		
	}
}
