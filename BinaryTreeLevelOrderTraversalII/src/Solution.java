import java.util.ArrayList;
import java.util.Stack;

import Solution.TreeNode;

public class Solution {
	
	  public class TreeNode {
	      public int val;
	      public TreeNode left, right;
	      public TreeNode(int val) {
	          this.val = val;
	          this.left = this.right = null;
	      }
	  }
	  
    public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
        // write your code here
    	ArrayList<TreeNode> list = new ArrayList<TreeNode>();
    	Stack<ArrayList<Integer>> stack = new Stack<ArrayList<Integer>>();
    	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

    	if(root == null) {
    		return result;
    	}
    	list.add(root);
    	
    	while(!list.isEmpty()) {
    		int length = list.size();
    		ArrayList<Integer> level = new ArrayList<Integer>();
    		while(--length >= 0) {
    			TreeNode node = list.remove(0);
    			level.add(node.val);
    			if(node.left != null) {
        			list.add(node.left);
    			}
    			if(node.right != null) {
    				list.add(node.right);
    			}
    		}
    		stack.push(level);
    	}
    	
    	while(!stack.isEmpty()) {
    		result.add(stack.pop());
    	}
    	
    	return result;
    }
    
    public static void main() {
    	
    }
}
