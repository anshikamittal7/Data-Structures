import java.util.*;

class Node{
    int data;
    int tail;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.tail=tail;
    }
}

class QueueUsingLinkedLists{
    Node head;
    Node tail;
    int size;
    public QueueUsingLinkedLists(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public void enqueue(int x){
        if(isEmpty()){
            Node newNode = new Node(x);
            this.head = newNode;
            this.tail = newNode;
        }else{
            Node newNode = new Node(x);
            tail.next = newNode;
            this.tail=newNode;
        }
        size++;
    }
    public Integer dequeue(){
        if(isEmpty()){
            return null;
        }
        int val = head.data;
        this.head = head.next;
        size--;
        return val;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public Integer front(){
        if(isEmpty()){
            return null;
        }
        return head.data;
    }
}   
    
class StackUsingQueue{
    int size;
    QueueUsingLinkedLists q1 = new QueueUsingLinkedLists();
    QueueUsingLinkedLists q2 = new QueueUsingLinkedLists();
    
    public StackUsingQueue(){
        size=0;
    }
    
    public void push(int x){
        while(!q1.isEmpty()){
            q2.enqueue(q1.dequeue());
        }
        q1.enqueue(x);
        while(!q2.isEmpty()){
            q1.enqueue(q2.dequeue());
        }
    }
    public boolean isEmpty(){
        return q1.isEmpty();
    }
    
    public Integer pop(){
        return q1.dequeue();
    }
    
    public Integer top(){
        return q1.front();
    }
    public int size(){
        return q1.size();
    }
}
    
class GFG {
	public static void main (String[] args) {
	    StackUsingQueue s = new StackUsingQueue();
	    for(int i=10;i<=50;i+=10){
	        s.push(i);
	    }
	    while(!s.isEmpty()){
	        System.out.println(s.pop());
	    }
	    System.out.println(s.size());
	}
}





