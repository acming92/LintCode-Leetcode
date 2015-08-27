

 
public class Solution {
	
	  public class TreeNode {
	      public int val;
	      public TreeNode left, right;
	      public TreeNode(int val) {
	          this.val = val;
	          this.left = this.right = null;
	      }
	  }
	  
    /**
     * @param root: The root of binary tree.
     * @return: True if the binary tree is BST, or false
     */
	private int lastVal = Integer.MIN_VALUE;
	private boolean firstNode = true;
    public boolean isValidBST(TreeNode root) {
        // write your code here
    	if(root == null) {
    		return true;
    	}
    	if(!(isValidBST(root.left))) {
    		return false;
    	}
    	if(!firstNode && lastVal >= root.val) {
    		return false;
    	}
    	firstNode = false;
    	lastVal = root.val;
    	if(!isValidBST(root.right)) {
    		return false;
    	}
    	return true;
    }
    
    public static void main(String[] args) {
    	
    }
}
