import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
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
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
        // write your code here
    	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    	if(root == null) {
    		return result;
    	}
    	Stack<TreeNode> stack = new Stack<TreeNode>();
    	Stack<TreeNode> stack1 = new Stack<TreeNode>();
    	stack.push(root);
    	while(!stack.isEmpty() || !stack1.isEmpty()) {
    		ArrayList<Integer> level = new ArrayList<Integer>();
    		if(!stack.isEmpty()) {
    			while(!stack.isEmpty()) {
    				TreeNode node = stack.pop();
    				level.add(node.val);
    				if(node.left != null) {
    					stack1.push(node.left);
    				}
    				if(node.right != null) {
    					stack1.push(node.right);
    				}
    			}
    		} else {
    			while(!stack1.isEmpty()) {
    				TreeNode node = stack1.pop();
    				level.add(node.val);
    				if(node.left != null) {
    					stack.push(node.right);
    				}
    				if(node.right != null) {
    					stack.push(node.left);
    				}
    			}
    		}
    		result.add(level);
    	}
    	
    	return result;
    }
    
    public static void main(String[] args) {
    	
    }
}
