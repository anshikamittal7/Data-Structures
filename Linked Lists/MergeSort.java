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
    
    public static Node mipll(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node temp = head;
        while(temp.next!=null&&temp.next.next!=null){
            temp=temp.next.next;
            head = head.next;
        }
        return head;
    }
    public static Node mergell(Node list1,Node list2){
        Node ans = new Node(0);
        Node temp = ans;
        while(list1 != null && list2 != null){
            if(list1.data>list2.data){
                ans.next = list2;
                ans = ans.next;
                list2 = list2.next;
            }
            else{
                ans.next = list1;
                ans = ans.next;
                list1 = list1.next;
            }
        }
        if(list1!=null){
            ans.next=list1;
        }
        else{
            ans.next = list2;
        }
        return temp.next;
    }
    public static Node mergeSortll(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node mid = mipll(head);
        Node midtemp = mid.next;
        mid.next = null;
        return mergell(mergeSortll(head),mergeSortll(midtemp));
    }
    
	public static void main (String[] args) {
        Node head = input();
        print(head);
        head = mergeSortll(head);
        print(head);
	}
}
