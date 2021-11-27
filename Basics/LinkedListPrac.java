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
            System.out.print(n1.data + " ");
            n1=n1.next;
        }
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
    
    
    
    
    public static node append(node n,int x){
        if(n==null){
            return new node(x);
        }
        n.next = append(n.next,x);
        return n;
    }
    
    public static node appendi(node head , int i, int x){
        if(head == null){
            return head;
        }
        if(i==0){
            node newnode = new node(x);
            newnode.next = head;
            return newnode;
        }
        head.next = appendi(head.next, i-1, x);
        return head;
    }
    
    public static node remove(node head, int i){
        if(head == null){
            return head;
        }
        if(i==0){
            return head.next;
        }
        head.next = remove(head.next,i-1);
        return head;
    }
    
    public static node removelast(node head){
        if(head.next==null){
            return head.next;
        }
        head.next = removelast(head.next);
        return head;
    }
    
    public static node reverse(node head){
        if(head == null || head.next == null){
            return head;
        }
        node temp = reverse(head.next);
        node temp2 = temp;
        while(temp2.next!=null){
            temp2 = temp2.next;
        }
        temp2.next = head;
        head.next = null;
        return temp;
    }
	public static void main (String[] args) {
		node n = input();
		print(n);
		n = reverse(n);
		print(n);
	}
}
