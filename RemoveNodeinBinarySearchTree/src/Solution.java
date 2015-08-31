
public class Solution {
	
	public static class TreeNode {
		public int val;
		public TreeNode left, right;
		public TreeNode(int val) {
		      this.val = val;
		      this.left = this.right = null;
		}
	}
	  
	public TreeNode removeNode(TreeNode root, int value) {
		if(root == null) {
			return null;
		}
		TreeNode target = search(root, value);
		if(target.left != null && target.right != null) {
			TreeNode sucessor = findRightLeftMostLeaf(target.right);
			if(sucessor != null) {
				int val = sucessor.val;
				removeNode(root, val);
				target.val = val;
			}
		}
		else if(target.left != null) {
			TreeNode father = findFather(root, target.val);
			if(father != null) {
				if(father.left == target) {
					father.left = target.left;
				} else {
					father.right = target.left;
				}
			} else {
				root = target.left;
			}
		}
		else if(target.right != null) {
			TreeNode father = findFather(root, target.val);
			if(father != null) {
				if(father.left == target) {
					father.left = target.right;
				} else {
					father.right = target.right;
				} 
			} else {
				root = target.right;
			}
		} else {
			TreeNode father = findFather(root, target.val);
			if(father != null) {
				father.left = null;
				father.right = null;
			} else {
				root = null;
			}
		}
		
		return root;
    }
    
    private TreeNode findFather(TreeNode root, int val) {
    	if(root.val == val) {
    		return null;
    	}
    	if(root.left != null) {
    		if(root.left.val == val) {
    			return root;
    		}
    		if(root.val > val) {
    			return findFather(root.left, val);
    		}
    	}
    	if(root.right != null) {
    		if(root.right.val == val) {
    			return root;
    		}
    		if(root.val < val) {
    			return findFather(root.right, val);
    		}
    	}
    	
    	return null;
	}
    
    public TreeNode search(TreeNode root, int value) {
    	if(root == null) {
    		return null;
    	}
    	
    	if(root.val == value) {
    		return root;
    	}
    	if(root.val < value) {
    		return search(root.right, value);
    	}
    	if(root.val > value) {
    		return search(root.left, value);
    	}
    	
		return null;
    }
    
    public TreeNode findRightLeftMostLeaf(TreeNode root) {
    	if(root == null) {
    		return null;
    	}
    	if(root.left == null) {
    		return root;
    	}
    	return findRightLeftMostLeaf(root.left);
    }
    
    public static void main(String[] args) {
    	Solution temp = new Solution();
    	TreeNode root = new TreeNode(20);
    	TreeNode node1 = new TreeNode(1);
    	TreeNode node2 = new TreeNode(40);
    	TreeNode node3 = new TreeNode(35);
    	root.left = node1;
    	root.right = node2;
    	node2.left = node3;
    	TreeNode root1 = temp.removeNode(root, 20);
    }
}
