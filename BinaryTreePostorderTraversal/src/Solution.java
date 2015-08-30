import java.util.ArrayList;

public class Solution {

		  public class TreeNode {
		      public int val;
		      public TreeNode left, right;
		      public TreeNode(int val) {
		          this.val = val;
		          this.left = this.right = null;
		      }
		  }
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
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
    	postTraverse(root.right, list);
    	list.add(root.val);
    }
    
    public static void main(String[] args) {
    	
    }
}
