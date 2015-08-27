
 

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
     * @param root: The root of the binary search tree.
     * @param node: insert this node into the binary search tree
     * @return: The root of the new binary search tree.
     */
    public TreeNode insertNode(TreeNode root, TreeNode node) {
        // write your code here
    	if(node == null) return root;
    	if(root == null) {
    		return root;
    	};
    	if(node.val < root.val) {
    		if(root.left == null) {
    			root.left = node;
    		} else {
        		insertNode(root.left, node);
    		}
    	} else {
    		if(root.right == null) {
    			root.right = node;
    		} else {
        		insertNode(root.right, node);
    		}
    	}
    	
    	return root;
    }
    
    public static void main(String[] args) {
    	
    }
}
