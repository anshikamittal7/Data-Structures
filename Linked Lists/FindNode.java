public class Solution {
    public static int find(LinkedListNode<Integer> head, int n, int index){
        if(head==null){
            return -1;
        }
		if(head.data == n){
            return index;
        }
        return find(head.next, n, index+1);
    }
	public static int findNode(LinkedListNode<Integer> head, int n) {
        return find(head,n,0);
	}
}
