class Solution
{
    static void linkdelete(Node head, int M, int N)
    {
        while(head != null){
            int temp = M;
            int temp2 = N+1;
            while(head != null && temp--!=1){
                head = head.next;
            }
            Node tail = head;
            while(head != null && temp2-- !=0){
                head = head.next;
            }
            if(tail!=null) tail.next = head;
        }
    }
}
