
 
 
public class Solution {
	
	  public class TreeNode {
		      public int val;
		      public TreeNode left, right;
		      public TreeNode(int val) {
		          this.val = val;
		          this.left = this.right = null;
		      }
		  }
	  
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // write your code here
    	if(preorder.length != inorder.length) {
    		return null;
    	}
    	return build(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }
    
    public TreeNode build(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
    	if(inStart > inEnd || preStart >= preorder.length) {
    		return null;
    	}
    	System.out.println(preStart);
    	TreeNode root = new TreeNode(preorder[preStart]);
    	int position = findPosition(inorder, inStart, inEnd, preorder[preStart]);
    	root.left = build(preorder, preStart + 1, preStart + 1 + position - inStart, inorder, inStart, position - 1);
    	root.right = build(preorder, preStart + 2 + position - inStart, preEnd, inorder, position + 1, inEnd);
    	return root;
    }
    
    public int findPosition(int[] inorder, int inStart, int inEnd, int target) {
    	for(int i = inStart; i <= inEnd; ++i) {
    		if(inorder[i] == target) {
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
