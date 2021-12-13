import java.util.*;
class Node{
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
    }
}
class GFG {
    public static int length(Node n1){
        int l=0;
        while(n1 != null){
            n1 = n1.next;
            l++;
        }
        return l;
    }
    public static void print(Node n1){
        while(n1 != null){
            System.out.print(n1.data + "-->");
            n1=n1.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public static Node input(){ 
        Scanner s = new Scanner(System.in);
        Node n1 = new Node(s.nextInt());
        if(n1.data == -1){
            return null;
        }
        Node temp = n1;
        while(s.hasNextInt()){
            int x = s.nextInt();
            if(x != -1){
                Node n2 = new Node(x);
                n1.next = n2;
                n1 = n1.next;
            }
            else{
                break;
            }
        }
        return temp;
    }
    
    public static Node bubbleSort(Node head){
        int l=length(head);
        Node dummy = new Node(-1);
        dummy.next = head;
        Node newhead = dummy;
        for(int i=0;i<l-1;i++){
            dummy = newhead;
            Node prev = newhead.next;
            Node after = newhead.next.next;
            int temp = l-i;   
            while(dummy!=null && temp-- !=0  && prev!=null && after!=null){
                if(prev.data > after.data){
                    dummy.next = after;
                    prev.next = after.next;
                    after.next = prev;
                }  
                dummy = dummy.next;    
                prev = dummy.next;
                after=prev.next;
            }
        }
        return newhead.next;
    }
    
	public static void main (String[] args) {
        Node head = input();
        print(head);
        
        head = bubbleSort(head);
        print(head);
	}
}
