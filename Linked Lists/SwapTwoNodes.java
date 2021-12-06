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
    public static Node swapTwoNodes(Node head, int i, int j){
        if(i==j||i>length(head)||j>length(head)){
            return head;
        }
        Node currentNode = head;
        Node prev = null;
        Node ci = null;
        Node iprev = null;
        Node cj = null;
        Node jprev = null;
        int pos = 0;
        
        while(currentNode != null){
            if(pos == i){
                iprev = prev;
                ci = currentNode;
            }
            else if(pos == j){
                jprev = prev;
                cj = currentNode;
            }
            prev = currentNode;
            currentNode = currentNode.next;
            pos+=1;
        }
        
        if(iprev != null){
            iprev.next = cj;
        }
        else{
            head = cj;
        }
        if(jprev != null){
            jprev.next = ci;
        }
        else{
            head = ci;
        }
        Node temp = cj.next;
        cj.next = ci.next;
        ci.next = temp;
        
        return head;
        
    }
    
	public static void main (String[] args) {
        Node head = input();
        print(head);
        head = swapTwoNodes(head,6,16);
        print(head);
	}
}
