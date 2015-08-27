

 
public class Solution {
	
	 public class TreeNode {
	     public int val;
	     public TreeNode left, right;
	     public TreeNode(int val) {
	         this.val = val;
	         this.left = this.right = null;
	     }
	 }
	 
	 public class wrapInt {
		 public int value;
	 }
	 
    /**
     * @param root: The root of binary tree.
     * @return: An integer.
     */
    public int maxPathSum(TreeNode root) {
        // write your code here
    	wrapInt maxmum = new wrapInt();
    	ParameterMaxPathSum(root, maxmum, new wrapInt());
    	return maxmum.value;
    }
    
    private void ParameterMaxPathSum(TreeNode root, wrapInt maxmum, wrapInt maxmumLength) {
    	 if(root == null) {
    		 maxmum.value = Integer.MIN_VALUE;
    		 maxmumLength.value = 0;
    		 return;
    	 }
    	 if(root.left == null && root.right == null) {
    		 maxmum.value = root.val;
    		 maxmumLength.value = root.val;
    		 return;
    	 }
    	 wrapInt rightMinmum = new wrapInt(), rightMinmumLength = new wrapInt();
    	 wrapInt leftMinmum = new wrapInt(), leftMinmumLength = new wrapInt();    	 
    	 ParameterMaxPathSum(root.left, leftMinmum, leftMinmumLength);
    	 ParameterMaxPathSum(root.right, rightMinmum, rightMinmumLength);
    	 int temp = max(leftMinmum.value, rightMinmum.value, leftMinmumLength.value + rightMinmumLength.value + root.val);
    	 maxmum.value = temp;
    	 maxmumLength.value = leftMinmumLength.value > rightMinmumLength.value ? leftMinmumLength.value : rightMinmumLength.value;
    	 maxmumLength.value += root.val;
    	 if(maxmum.value < root.val) {
    		maxmum.value = root.val;
    	 }
    	 if(maxmumLength.value < root.val) {
    		 maxmumLength.value = root.val;
    	 }
    }
    
    private int max(int a, int b, int c) {
    	if(a >= b && a >= c) {
    		return a;
    	}
    	if(b >= c) {
    		return b;
    	}
    	return c;
    }
    
    public static void main(String[] args) {
    	
    }
}
