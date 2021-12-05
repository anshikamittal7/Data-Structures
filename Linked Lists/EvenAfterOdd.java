class Solution{
    Node divide(int N, Node head){
        Node even = new Node(-1);
        Node eventail = even;
        Node odd = new Node(-1);
        Node oddtail = odd;
        while(head != null){
            if(head.data %2 == 0){
                eventail.next = head;
                eventail = eventail.next;
            }
            else{
                oddtail.next = head;
                oddtail = oddtail.next;
            }
            head = head.next;
        }
        oddtail.next = null;
        eventail.next = null;
        even = even.next;
        
        if(even == null){
            return odd.next;
        }
        eventail.next = odd.next;
        return even;
    }   
}
