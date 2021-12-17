import java.util.*;

class GFG {
    public static boolean brackets(String str){
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<str.length();i++){
		    if(str.charAt(i)=='('){
		        stack.push('(');
		    }
		    if(str.charAt(i)=='{'){
		        stack.push('{');
		    }
		    if(str.charAt(i)=='['){
		        stack.push('[');
		    }
		    
		    
		    if(str.charAt(i)==')'){
    		    if(stack.isEmpty() || stack.pop()!='('){
    		        return false;
    		    }    
		    }
		    if(str.charAt(i)=='}'){
    		    if(stack.isEmpty() || stack.pop()!='{'){
    		        return false;
    		    }    
		    }
		    if(str.charAt(i)==']'){
    		    if(stack.isEmpty() || stack.pop()!='['){
    		        return false;
    		    }    
		    }
		}
		return stack.isEmpty();
    }
    
	public static void main (String[] args) {
	    Scanner s = new Scanner(System.in);
	    int t = s.nextInt();
	    while(t-- != 0){
	        String str = s.next();
	        System.out.println(brackets(str));
	    }
	    
	}
}
