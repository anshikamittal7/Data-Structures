/*package whatever //do not write package name here */

import java.util.*;

class GFG {
    public static String[] array(int n){
        int rem=n%10;
        if(rem==2){
            String arr[]={"a","b","c"};
            return arr;
        }
        else if(rem==3){
            String arr[]={"d","e","f"};
            return arr;
        }
        else if(rem==4){
            String arr[]={"g","h","i"};
            return arr;
        }
        else if(rem==5){
            String arr[]={"j","k","l"};
            return arr;
        }
        else if(rem==6){
            String arr[]={"m","n","o"};
            return arr;
        }
        else if(rem==7){
            String arr[]={"p","q","r","s"};
            return arr;
        }
        else if(rem==8){
            String arr[]={"t","u","v"};
            return arr;
        }
        else if(rem==9){
            String arr[]={"w","x","y","z"};
            return arr;
        }
        else{
            String arr[]={""};
            return arr;
        }
        
    }
    public static String[] key(int n){
        if(n==0){
            String ans[]={""};
            return ans;
        }
        String arr[]=array(n);
        String arr2[]=key(n/10);
        String ans[]=new String[arr.length*arr2.length];
        int k=0;
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr.length;j++){
                ans[k++]=arr2[i]+arr[j];
            }
        }
        return ans;
    }
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0){
		    int n=s.nextInt();
		    String arr[]=key(n);
		    for(int i=0;i<arr.length;i++){
		        System.out.print(arr[i]+" ");
		    }
		    System.out.println();
		}
	}
}
