import java.util.Stack;

public class Solution {
	
	private Stack<Integer> stack;
	private Stack<Integer> minStack;
    
    public Solution() {
        // do initialize if necessary
    	stack = new Stack<Integer>();
    	minStack = new Stack<Integer>();
    }

    public void push(int number) {
        // write your code here
    	stack.push(number);
    	
    	if(minStack.isEmpty()) {
    		minStack.push(number);
    	} else {
    		minStack.push(Math.max(number, minStack.peek()));
    	}
    }

    public int pop() {
    	minStack.pop();
    	return stack.pop();
    }

    public int min() {
        // write your code here
    	return minStack.peek();
    }
}