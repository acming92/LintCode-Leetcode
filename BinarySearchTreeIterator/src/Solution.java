import java.util.Stack;

/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 * Example of iterate a tree:
 * Solution iterator = new Solution(root);
 * while (iterator.hasNext()) {
 *    TreeNode node = iterator.next();
 *    do something for node
 * } 
 */
public class Solution {
	
	  public class TreeNode {
		      public int val;
		      public TreeNode left, right;
		      public TreeNode(int val) {
		          this.val = val;
		          this.left = this.right = null;
		      }
		  }
	private TreeNode currentNode;
	private Stack<TreeNode> mStack = new Stack<TreeNode>();
    //@param root: The root of binary tree.
    public Solution(TreeNode root) {
        // write your code here
    	currentNode = root;
    }

    //@return: True if there has next node, or false
    public boolean hasNext() {
        // write your code here
    	if(currentNode != null || !mStack.isEmpty()) {
    		return true;
    	}
    	return false;
    }
    
    //@return: return next node
    public TreeNode next() {
        // write your code here
    	while(currentNode != null) {
    		mStack.push(currentNode);
    		currentNode = currentNode.left;
    	}
    	currentNode = mStack.pop();
    	TreeNode val = currentNode;
    	currentNode = currentNode.right;
    	return val;
    }
}