/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        int num=0;
        while(head!=null){
            num=num*2 + head.val;
            head=head.next;
        }
        return num;
        // int size=0;
        // ListNode temp = head;
        // while(temp.next!=null){
        //     temp=temp.next;
        //     size++;
        // }
        // int ans = 0;
        // while(size!=-1){
        //     ans=ans+((int)Math.pow(2,size)*head.val);
        //     head=head.next;
        //     size--;
        // }
        // return ans;
    }
}