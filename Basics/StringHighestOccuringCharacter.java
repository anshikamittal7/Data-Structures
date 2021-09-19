import java.util.*;

class GFG {
    public static void sort(StringBuffer str){
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                char temp=str.charAt(i);
                if(str.charAt(i)>str.charAt(j)){
                    str.setCharAt(i,str.charAt(j));
                    str.setCharAt(j,temp);
                }
                
            }
        }
    }
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		StringBuffer str=new StringBuffer(s.next());
		int arr[]=new int[str.length()];
		int count =1;
		sort(str);
		for(int i=0;i<str.length();i++){
		    count=1;
		    char j=str.charAt(i);
		    while(i<str.length()-1){
		        if(j!=str.charAt(i+1)){
		            break;
		        }else{
		            count++;
		        }
		        i++;
		    }
		    arr[i]=count;
	    }
	    int max=arr[0];int ans=0;
	    for(int k=0;k<arr.length;k++){
		    if(max<arr[k]){
		        max=arr[k];
		        ans=k;
		    }
		}
		System.out.println(str.charAt(ans));
	}	
}

// orr
// optimised:

import java.util.*;

class GFG {
    public static void sort(StringBuffer str){
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                char temp=str.charAt(i);
                if(str.charAt(i)>str.charAt(j)){
                    str.setCharAt(i,str.charAt(j));
                    str.setCharAt(j,temp);
                }
                
            }
        }
    }
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		StringBuffer str=new StringBuffer(s.next());
		int count =1;int max=0;char ans=str.charAt(0);
		sort(str);
		for(int i=0;i<str.length();i++){
		    count=1;
		    char j=str.charAt(i);
		    while(i<str.length()-1){
		        if(j!=str.charAt(i+1)){
		            break;
		        }else{
		            count++;
		        }
		        i++;
		    }
		    if(max<count){
		        max=count;
		        ans=str.charAt(i);
		    }
	    }
		System.out.println(ans);
	}	
}

// input: highesthihhhh
// output: h

//ooooooooooooorrrrrrrrrrrrrrrr
//more optimised


import java.util.*;
class GFG {
    public static void sort(StringBuffer str){
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                char temp=str.charAt(i);
                if(str.charAt(i)>str.charAt(j)){
                    str.setCharAt(i,str.charAt(j));
                    str.setCharAt(j,temp);
                }
                
            }
        }
    }
    public static void max(StringBuffer str){
        int count =1;int max=0;
        char ans=str.charAt(0);
		for(int i=0;i<str.length();i++){
		    count=1;
		    char j=str.charAt(i);
		    while(i<str.length()-1 && j==str.charAt(i+1)){
		        count++;
		        i++;
		    }
		    if(max<count){
		        max=count;
		        ans=str.charAt(i);
		    }
	    }
		System.out.println(ans);
    }
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		    while(t--!=0){
		        StringBuffer str=new StringBuffer(s.next());
        		sort(str);
        		max(str);
		    }
		
	}	
}

// input:
// 3
// xy
// bbaaaccccc
// abababaccc

// output:
// x
// c
// a
