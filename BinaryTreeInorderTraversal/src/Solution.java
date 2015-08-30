import java.util.ArrayList;

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
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        // write your code here
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	postTraverse(root, result);
    	return result;
    }
    
    public void postTraverse(TreeNode root, ArrayList<Integer> list) {
    	if(root == null) {
    		return;
    	}
    	postTraverse(root.left, list);
    	list.add(root.val);
    	postTraverse(root.right, list);
    }
    
    public static void main(String[] args) {
    	
    }
}
