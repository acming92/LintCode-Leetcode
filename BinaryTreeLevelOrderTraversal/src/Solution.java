import java.util.ArrayList;

public class Solution {
		public static class TreeNode {
	      public int val;
	      public TreeNode left, right;
	      public TreeNode(int val) {
	          this.val = val;
	          this.left = this.right = null;
	      }
	  }
		
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        // write your code here
    	ArrayList<TreeNode> list = new ArrayList<TreeNode>();
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
    		result.add(level);
    	}
    	
    	return result;
    }
    
}
