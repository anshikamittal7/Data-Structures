import java.util.*;

class GFG {
    public static ArrayList<Integer> findAllIndices(int arr[],int i,int x){
        if(i==arr.length){
            ArrayList<Integer> ans = new ArrayList<>();
            return ans;
        } 
        ArrayList<Integer> ans = findAllIndices(arr, i+1, x);
        if(arr[i]==x) {
            ans.add(i);
        }
        return ans;
    }
	public static void main (String[] args) {
	    int arr[] = {4,1,2,3,4,0,5,4,6,7,4};
	    int x = 4;
	    System.out.println(findAllIndices(arr,0,x));
	}
}
