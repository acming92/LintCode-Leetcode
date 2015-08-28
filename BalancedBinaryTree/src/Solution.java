
public class Solution {
	
	public class TreeNode {
	    public int val;
	    public TreeNode left, right;
	    public TreeNode(int val) {
	        this.val = val;
	         this.left = this.right = null;
	     }
	}
	
	public class BalanceHeight {
		public int height;
		public boolean isBalance;
	}
	
    public boolean isBalanced(TreeNode root) {
        // write your code here
    	if(root == null) {
    		return true;
    	}
    	BalanceHeight arg = new BalanceHeight();
    	checkBalance(root, arg);
    	if(arg.isBalance) {
    		return true;
    	} else{
        	return false;
    	}
    }
    
    public void checkBalance(TreeNode root, BalanceHeight arg) {
    	BalanceHeight leftArg = new BalanceHeight(), rightArg = new BalanceHeight();
    	if(root.left != null) {
    		checkBalance(root.left, leftArg);
    	} else {
    		leftArg.height = 0;
    		leftArg.isBalance = true;
    	}
    	if(root.right != null) {
    		checkBalance(root.right, rightArg);
    	} else {
    		rightArg.height = 0;
    		rightArg.isBalance = true;
    	}
    	if(!(leftArg.isBalance && rightArg.isBalance)) {
    		arg.isBalance = false;
    		return;
    	} else {
    		int difference = leftArg.height - rightArg.height;
    		if(difference > 1 || difference < -1) {
    			arg.isBalance = false;
    			return;
    		}
    	}
    	arg.isBalance = true;
    	arg.height = Math.max(leftArg.height, rightArg.height) + 1;
    }
    
    public static void main(String[] args) {
    	
    }
}
