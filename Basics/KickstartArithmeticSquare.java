import java.util.*;

class GFG {
    public static int ap(int n1,int n2,int n3){
        if(n2-n1==n3-n2) return 1;
        return 0;
    }
    public static int chkx(int i,int j){
        int x=(i+j)/2;
        return x;
    }
    
    public static int greatest(int p,int q,int r,int t){
        if(p>=q && p>=r && p>=t) {return p;}
        if(q>=p && q>=r && q>=t) {return q;}
        if(r>=p && r>=q && r>=t) {return r;}
        if(t>=p && t>=q && t>=r) {return t;}
        return -1;    
    }
    
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int turn=s.nextInt();
		for(int i=1;i<=turn;i++){
		    int a=s.nextInt();int b=s.nextInt();int c=s.nextInt();
		    int d=s.nextInt();int e=s.nextInt();
		    int f=s.nextInt();int g=s.nextInt();int h=s.nextInt();
		    
		    int halfsum=ap(a,b,c)+ap(f,g,h)+ap(a,d,f)+ap(c,e,h);
		    
		    int n1=(chkx(a,h)); 
		    int m1=ap(d,n1,e)+ap(a,n1,h)+ap(c,n1,f)+ap(b,n1,g);
		    
		    int n2=(chkx(c,f));
		    int m2=ap(d,n2,e)+ap(a,n2,h)+ap(c,n2,f)+ap(b,n2,g);
		    
		    int n3=(chkx(b,g));
		    int m3=ap(d,n3,e)+ap(a,n3,h)+ap(c,n3,f)+ap(b,n3,g);
		    
		    int n4=(chkx(d,e));
		    int m4=ap(d,n4,e)+ap(a,n4,h)+ap(c,n4,f)+ap(b,n4,g);
		    
		    System.out.printf("Case #%d: %d\n",i,greatest(m1,m2,m3,m4)+halfsum);
		}
	}
}
