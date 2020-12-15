/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
	Scanner s=new Scanner(System.in);
    int n1=s.nextInt();
    int a1[]=new int[n1];
    for (int i=0;i<a1.length;i++){
        a1[i]=s.nextInt();
    }
    int n2=s.nextInt();
    int a2[]=new int[n2];
    for (int j=0;j<a2.length;j++){
        a2[j]=s.nextInt();
    }
    int temp=a2.length;
    if (a1.length>a2.length){
        temp=a1.length;
    }
    int ans[]=new int[temp];
    int p=0;int q=0; int r=0;
    while (p<a1.length && q<a2.length){
        ans[r]=a1[p]+a2[q];
        p++;
        q++;
        r++;
    }
    while (p<a1.length){
        ans[r]=a1[p];
        p++;
        r++;
    }
    while (q<a2.length){
        ans[r]=a2[q];
        q++;
        r++;
    }
    for (int k=0;k<ans.length;k++){
        System.out.println(ans[k]);
    }
  }

}
