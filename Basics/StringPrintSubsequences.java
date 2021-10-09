import java.util.*;

class GFG {
    public static String[] subsequences(String str){
        if(str.length()==0){
            String ans[]={""};
            return ans;
        }
        String smallans[]=subsequences(str.substring(1));
        String ans[]=new String[smallans.length*2];
        
        for(int i=0;i<smallans.length;i++){
            ans[i]=smallans[i];
        }
        for(int i=0;i<smallans.length;i++){
            ans[smallans.length + i]=str.charAt(0)+smallans[i];
        }
        return ans;
        
    }
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0){
		    String str=s.next();
		    String ans[]=subsequences(str);
		    for(int i=0;i<ans.length;i++){
		        System.out.print(ans[i]+" ");
		    }
		    System.out.println();
		}	
	}
}

