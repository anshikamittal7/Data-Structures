import java.util.*;

class StackUsingArray{
    int arr[]=new int[1];
    int arraylength = 0;

    public void push(int x){
        if(arraylength<arr.length){
            arr[arraylength]=x;
        }
        else{
            int newarr[] = new int[2*arr.length];
            int i=0;
            for(i=0;i<arr.length;i++){
                newarr[i]=arr[i];
            }
            newarr[arraylength]=x;
            this.arr = newarr;
        }
        arraylength++;
        
    }
    public void size(){
        System.out.println(arraylength);
    }
    public void pop(){
        if(arraylength==0){
            System.out.println("stack under flow");
            return;
        }
        int newarr[]=new int[arraylength-1];
        for(int i=0;i<newarr.length;i++){
            newarr[i]=arr[i];
        }
        arraylength--;
        this.arr=newarr;
    }
    public void top(){
        System.out.println(arr[arraylength-1]);
    }
    public void print(){
        for(int i=0;i<arraylength;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void isEmpty(){
        if(arraylength==0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
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
	    stack.print();
	    stack.isEmpty();
	}
}
