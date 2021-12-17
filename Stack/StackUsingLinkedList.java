import java.util.*;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
}

class StackUsingLinkedLists{
    Node head;
    int size;
    public StackUsingLinkedLists(){
        size = 0;
        this.head = head;
    }
    
    public void push(int x){
        Node newNode = new Node(x);
        newNode.next = head;
        head = newNode;
        size++;
    }
    public boolean isEmpty(){
        return size==0;
    }
    
    public Integer pop(){
        if(size== 0) return null;
        int ans = head.data;
        head = head.next;
        size--;
        return ans;
    }
    
    public Integer top(){
        if(size== 0) return null;
        return head.data;
    }
    public int size(){
        return size;
    }
}

class GFG {
	public static void main (String[] args) {
		StackUsingLinkedLists stack = new StackUsingLinkedLists();
		for(int i=10;i<=50;i+=10){
		    stack.push(i);
		}
		System.out.println("Size "+stack.size());
		System.out.println("Top "+stack.top());
		for(int i=1;i<=10;i++){
		    System.out.println(stack.pop());
		}
		System.out.println(stack.isEmpty());
	}
}





