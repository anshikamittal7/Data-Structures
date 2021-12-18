
import java.util.*;

class QueueUsingArray{
    private int arr[];
    private int rear;
    private int front;
    public QueueUsingArray(int size){
        this.arr=new int[size];
        this.rear=0;
        this.front=0;
    }
    
    public void doubleCapacity(){
        int newarr[]=new int[arr.length*2];
        for(int i=front;i<rear;i++){
            newarr[i-front]=arr[i];
        }
        this.rear=rear-front;
        this.front=0;
        this.arr=newarr;
    }
    
    public void enqueue(int x){
        if(rear>=arr.length){
            doubleCapacity();
        }
        arr[rear]=x;
        rear++;
    }
    
    public Integer dequeue(){
        if(isEmpty()){
            return null;
        }
        return arr[front++];
    }
    public int size(){
        return rear-front;
    }
    public boolean isEmpty(){
        return rear==front;
    }
    public Integer front(){
        if(isEmpty()){
            return null;
        }
        return arr[front];
    }
}

class GFG {
    
	public static void main (String[] args) {
	    Scanner s = new Scanner(System.in);
	    QueueUsingArray queue = new QueueUsingArray(3);
	    for(int i=10;i<=100;i+=10){
	        queue.enqueue(i);
	    }
	    System.out.println("removed "+queue.dequeue());
	    System.out.println("removed "+queue.dequeue());
	    while(!queue.isEmpty()){
	        System.out.println("removed "+queue.dequeue());
	    }
	    System.out.println("size "+queue.size());
	    System.out.println("empty "+queue.isEmpty());
	    System.out.println("front "+queue.front());
	}
}
