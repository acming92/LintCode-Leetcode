
 
 
public class Solution {
	
	  public class TreeNode {
		      public int val;
		      public TreeNode left, right;
		      public TreeNode(int val) {
		          this.val = val;
		          this.left = this.right = null;
		      }
		  }
	  
	    public TreeNode buildTree(int[] inorder, int[] postorder) {
	        // write your code here
	    	if(postorder.length != inorder.length) {
	    		return null;
	    	}
	    	return build(postorder, 0, postorder.length - 1, inorder, 0, inorder.length - 1);
	    }
	    
	    public TreeNode build(int[] postorder, int postStart, int postEnd, int[] inorder, int inStart, int inEnd) {
	    	if(inStart > inEnd || postEnd < postStart || postEnd >= postorder.length) {
	    		return null;
	    	}
	    	TreeNode root = new TreeNode(postorder[postEnd]);
	    	int position = findPosition(inorder, inStart, inEnd, postorder[postEnd]);
	    	root.right = build(postorder, postEnd - (inEnd - position) + 1, postEnd - 1, inorder, inStart, position - 1);
	    	root.left = build(postorder, postStart, postEnd - (inEnd - position), inorder, position + 1, inEnd);
	    	return root;
	    }
	    
	    public int findPosition(int[] postorder, int inStart, int inEnd, int target) {
	    	for(int i = inStart; i <= inEnd; ++i) {
	    		if(postorder[i] == target) {
	    			return i;
	    		}
	    	}
	    	
	    	return -1;
	    }
    public static void main(String[] args) {
    	Solution temp = new Solution();
    	int[] a = {1, 2};
    	int[] b = {1, 2};
    	temp.buildTree(a, b);
    }
}
