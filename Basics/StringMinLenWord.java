import java.util.*;

class GFG {
    
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
	    int t=s.nextInt();
	    s.nextLine();
	    while(t--!=0){
	        String str=s.nextLine();
	        int temp=Integer.MAX_VALUE;
	        int count=0;
	        String ans="";
	        for(int i=0;i<str.length();i++){
	            count=0;
	            String word="";
	            while(i<str.length() && str.charAt(i)!=' ' ){
	                count++;
	                word+=str.charAt(i);
	                i++;
	            }
	            if(count<temp){
	                temp=count;
	                ans=word;
	            }
	        }
	        System.out.println(ans);
	    }	
	}
}
