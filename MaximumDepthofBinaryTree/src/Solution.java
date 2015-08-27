
 
 
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
     * @return: An integer.
     */
    public int maxDepth(TreeNode root) {
        // write your code here
    	if(root == null) return 0;
    	int left = maxDepth(root.left);
    	int right = maxDepth(root.right);
    	return left > right ? left + 1: right + 1;   	
    }
    
    public static void main(String args[]) {
    	
    }
}
