import java.util.*;
public class Main{
    public static void main(String[] args){
          Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int sum=0;
        int sum2=0;
        int r=0;
        while (N!=0){
           r=N%10;
            N=N/10;
            if (r%2==0){
               sum=sum+r;
            }if (r%2!=0){
                sum2=sum2+r;
            }
            
        }
        
      System.out.print(sum+" "+sum2);

    }
    
    
}   
