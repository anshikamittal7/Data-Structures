
import java.util.*;

class GFG {
    public static void reverse(Stack<Integer> stack, Stack<Integer> help){
        if(stack.size()<=1){
            return;
        }
        int popped = stack.pop();
        reverse(stack,help);
        while(!stack.isEmpty()){
            help.push(stack.pop());
        }
        stack.push(popped);
        while(!help.isEmpty()){
            stack.push(help.pop());
        }
    }
    
	public static void main (String[] args) {
	    Stack<Integer> stack = new Stack<>();
	    Stack<Integer> help = new Stack<>();
    	for(int i=10 ;i<200;i+=20){
    	    stack.push(i);
    	}
    	System.out.println(stack);
		reverse(stack,help);
		System.out.println(stack);
	}
}
