/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		String l=s.nextLine();
		char vow[]={'a','e','i','o','u','A','E','I','O','U'}; 
		String n="";
		for(int i=0;i<l.length();i++){
		    for(int j=0;j<vow.length;j++){
		        if(l.charAt(i)==vow[j]){
		          l=l.replace(l.charAt(i),'#'); 
		    }
		}
		if(l.charAt(i)!='#'){
		    n+=l.charAt(i);
		}
		}
		
		System.out.println(n);
	}
}
