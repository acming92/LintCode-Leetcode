import java.util.Stack;

public class Solution {

	public class TreeNode {
		public int val;
		public TreeNode left, right;
		public TreeNode(int val) {
			this.val = val;
			this.left = this.right = null;
		}
	}
	 
    public TreeNode maxTree(int[] A) {
        // write your code here
    	if(A == null || A.length == 0) {
    		return null;
    	}
    	
    	Stack<TreeNode> stack = new Stack<TreeNode>();
    	
    	for(int i  = 0; i < A.length; ++i) {
    		TreeNode node = new TreeNode(A[i]);
    		if(stack.isEmpty()) {
    			stack.push(node);
    		} else {
    			if(A[i] < stack.peek().val) {
    				stack.push(node);
    			} else {
    				TreeNode top = stack.pop();
    				while(!stack.isEmpty() && stack.peek().val < A[i]) {
    					stack.peek().right = top;
    					top = stack.pop();
    				}
    				node.left = top;
    				stack.push(node);
    			}
    		}
    	}
    	
    	TreeNode top = stack.pop();
    	while(!stack.isEmpty()) {
    		stack.peek().right = top;
    		top = stack.pop();
    	}
    	
    	return top;
    }
    
    public static void main(String[] args) {
    	Solution temp = new Solution();
    	int[] A = {2, 5, 6, 0, 3, 1};
    	
    }
}
