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
    
    public ArrayList<Integer> searchRange(TreeNode root, int k1, int k2) {
        // write your code here
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	search(result, root, k1, k2);
    	return result;
    }
    
    public void search(ArrayList<Integer> list, TreeNode root, int k1, int k2) {
    	if(root == null) {
    		return;
    	}
    	
    	if(root.val > k1) {
    		search(list, root.left, k1, k2);
    	}
    	if(root.val >= k1 && root.val <= k2) {
    		list.add(root.val);
    	}
    	if(root.val < k2) {
    		search(list,  root.right, k1, k2);
    	}
    }
    
    public static void main(String[] args) {
    }
}
