
public class Solution {
	  	  public class TreeNode {
		      public int val;
		      public TreeNode left, right;
		      public TreeNode(int val) {
		          this.val = val;
		          this.left = this.right = null;
		      }
		  }
    public int minDepth(TreeNode root) {
        // write your code here
    	if(root == null) {
    		return 0;
    	}
    	if(root.left == null && root.right == null) {
    		return 1;
    	}
    	int left, right;
    	if(root.left != null) {
    		left = minDepth(root.left);
    	} else {
    		left = 0xffffff;
    	}
    	if(root.right != null) {
    		right = minDepth(root.right);
    	} else {
    		right = 0xffffff;
    	}
    	return Math.min(left, right) + 1;
    }
    
    public static void main(String[] args) {
    	
    }
}
