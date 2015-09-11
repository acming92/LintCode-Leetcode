import java.util.Stack;

public class Solution {
    /**
     * @param height: A list of integer
     * @return: The area of largest rectangle in the histogram
     */
    public int largestRectangleArea(int[] height) {
        // write your code here
    	if(height == null || height.length == 0) {
    		return 0;
    	}
    	
    	Stack<Integer> stack = new Stack<Integer>();
    	int maximum = 0;
    	
    	for(int i = 0; i <= height.length; ++i) {
    		int curt = (i == height.length) ? -1 : height[i];
    		while(!stack.isEmpty() && curt <= height[stack.peek()]) {
    			int h = height[stack.pop()];
    			int w = stack.isEmpty() ? i : i - stack.peek() - 1;
    			maximum = Math.max(maximum, w * h);
    		}
    		
    		stack.push(i);
    	}
    	
    	return maximum;
    }
    
    public static void main(String[] args) {
    	Solution temp = new Solution();
    	int[] A = {2,1,5,6,2,3};
    	System.out.println(temp.largestRectangleArea(A));
    }
}
