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
	 
    /**
     * @param root: The root of binary tree.
     * @return: Preorder in ArrayList which contains node values.
     */
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        // write your code here
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	traverse(list, root);
    	return list;
    }
    
    public void traverse(ArrayList<Integer> list, TreeNode root) {
    	if(root == null) return;
    	list.add(root.val);
    	traverse(list, root.left);
    	traverse(list, root.right);
    }
    
    public static void main(String[] args) {
    	
    }
}