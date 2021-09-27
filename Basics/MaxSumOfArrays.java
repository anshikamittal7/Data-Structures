import java.util.*;

class GFG {
    public static int maxsum(int arr1[],int arr2[]){
        int i=0,j=0;
        int sum1=0,sum2=0,ans=0;
        while(i<arr1.length&&j<arr2.length){
            if(arr1[i]<arr2[j]){
                sum1+=arr1[i++];
            }
            else if(arr1[i]>arr2[j]){
                sum2+=arr2[j++];
            }
            else{
                ans+=Math.max(sum1,sum2);
                ans+=arr1[i];
                sum1=0;
                sum2=0;
                i++;j++;
            }
        } 
        while(i<arr1.length){
            sum1+=arr1[i++];
        }
        while(j<arr2.length){
            sum2+=arr2[j++];
        }
        ans += Math.max(sum1, sum2);

        return ans;
    }
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int arr1[]=new int[s.nextInt()];
		for(int i=0;i<arr1.length;i++){
		    arr1[i]=s.nextInt();
		}
		int arr2[]=new int[s.nextInt()];
		for(int i=0;i<arr2.length;i++){
		    arr2[i]=s.nextInt();
		}
		System.out.println(maxsum(arr1,arr2));
	}
}
