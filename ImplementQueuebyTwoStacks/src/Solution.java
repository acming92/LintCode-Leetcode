import java.util.Stack;

public class Solution {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public Solution() {
       // do initialization if necessary
    	stack1 = new Stack<Integer>();
    	stack2 = new Stack<Integer>();
    }
    
    public void stack2toStack1() {
    	while(!stack2.isEmpty()) {
    		stack1.push(stack2.pop());
    	}
    }
    
    public void push(int element) {
        // write your code here
    	stack2.push(element);
    }

    public int pop() {
        // write your code here
    	if(stack1.isEmpty()) {
    		stack2toStack1();
    	}
    	
    	return stack1.pop();
    }

    public int top() {
        // write your code here
    	if(stack1.isEmpty()) {
    		stack2toStack1();
    	}
    	
    	return stack1.peek();
    }
}