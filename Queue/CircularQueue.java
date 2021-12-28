import java.util.*;

class QueueUsingArray{
    private int arr[];
    private int rear;
    private int front;
    private int size;
    public QueueUsingArray(int size){
        this.arr=new int[size];
        this.rear=0;
        this.front=0;
        this.size=0;
    }
    public QueueUsingArray(){
        this.arr=new int[5];
        this.rear=0;
        this.front=0;
        this.size=0;
    }
    
    public void enqueue(int x){
        if(size == arr.length) return;
        if(size==0) {
            front=0;
        }
        rear = rear%arr.length;
        size++;
        arr[rear++]=x;
    }
    
    public Integer dequeue(){
        if(size==0){
            return null;
        }
        front = front%arr.length;
        if(size==0){
            front = 0;
            rear = 0;
            return null;
        }
        size--;
        return arr[front++];
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public Integer front(){
        if(isEmpty()){
            return null;
        }
        front = front%arr.length;
        return arr[front];
    }
}

class GFG {
    
	public static void main (String[] args) {
	    Scanner s = new Scanner(System.in);
	    QueueUsingArray q = new QueueUsingArray(4);
	    q.enqueue(10);
	    q.enqueue(20);
	    q.enqueue(30);
	    q.enqueue(70);
	    q.dequeue();
	    q.enqueue(90);
	    q.dequeue();
	    q.dequeue();
	    q.dequeue();
	    System.out.println(q.front());
	    System.out.println(q.size());
	}
}
