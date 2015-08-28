

public class Solution {
	  public class TreeNode {
	      public int val;
	      public TreeNode left, right;
	      public TreeNode(int val) {
	          this.val = val;
	          this.left = this.right = null;
	      }
	  }
   
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode A, TreeNode B) {
        // write your code here
    	if(root == null || root == A || root == B) {
    		return root;
    	}
    	
    	TreeNode left = lowestCommonAncestor(root.left, A, B);
    	TreeNode right = lowestCommonAncestor(root.right, A, B);
    	if(left != null && right != null) {
    		return root;
    	}
    	if(left != null) { 
    		return left;
    	}
    	if(right != null) {
    		return right;
    	}
    	return null;
    }
    
    public static void main() {
    	
    }
}
