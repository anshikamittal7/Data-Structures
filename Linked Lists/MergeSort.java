import java.util.*;
class node{
    int data;
    node next;
    
    public node(int data){
        this.data = data;
    }
}
class GFG {
    public static int length(node n1){
        int l=0;
        while(n1 != null){
            n1 = n1.next;
            l++;
        }
        return l;
    }
    public static void print(node n1){
        while(n1 != null){
            System.out.print(n1.data + "-->");
            n1=n1.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public static node input(){
        Scanner s = new Scanner(System.in);
        node n1 = new node(s.nextInt());
        if(n1.data == -1){
            return null;
        }
        node temp = n1;
        while(s.hasNextInt()){
            int x = s.nextInt();
            if(x != -1){
                node n2 = new node(x);
                n1.next = n2;
                n1 = n1.next;
            }
            else{
                break;
            }
        }
        return temp;
    }
    
    public static node mipll(node head){
        if(head==null||head.next==null){
            return head;
        }
        node temp = head;
        while(temp.next!=null&&temp.next.next!=null){
            temp=temp.next.next;
            head = head.next;
        }
        return head;
    }
    public static node mergell(node list1,node list2){
        node ans = new node(0);
        node temp = ans;
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
    public static node mergeSortll(node head){
        if(head==null||head.next==null){
            return head;
        }
        node mid = mipll(head);
        node midtemp = mid.next;
        mid.next = null;
        return mergell(mergeSortll(head),mergeSortll(midtemp));
    }
    
	public static void main (String[] args) {
        node head = input();
        print(head);
        head = mergeSortll(head);
        print(head);
	}
}
