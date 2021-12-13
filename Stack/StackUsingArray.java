import java.util.*;

class StackUsingArray{
    private int arr[];
    private int topIndex;
    public StackUsingArray(){
        topIndex=0;
        arr=new int[5];
        
    }
    public void push(int x){
        if(topIndex<arr.length){
            arr[topIndex]=x;
        }
        else{
            int newarr[] = new int[2*arr.length];
            for(int i=0;i<arr.length;i++){
                newarr[i]=arr[i];
            }
            newarr[topIndex]=x;
            this.arr = newarr;
        }
        topIndex++;
        
    }
    public void size(){
        System.out.println(topIndex);
    }
    public void pop(){
        if(topIndex==0){
            System.out.println("stack under flow");
            return;
        }
        topIndex--;
    }
    public void top(){
        if(topIndex==0){
            System.out.println("stack empty exception");
            return;
        }
        System.out.println(arr[topIndex-1]);
    }
    public void print(){
        for(int i=0;i<topIndex;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void isEmpty(){
        System.out.println(topIndex==0);
    }
}

class GFG {
	public static void main (String[] args) {
	    StackUsingArray stack = new StackUsingArray();
	    stack.push(10);
	    stack.push(20);
	    stack.push(30);
	    stack.push(40);
	    stack.pop();
	    stack.push(90);
	    stack.print();
	    stack.isEmpty();
	    stack.size();
	    stack.top();
	}
}
