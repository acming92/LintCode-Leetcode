import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

class Solution {
 
	  public class TreeNode {
		      public int val;
		      public TreeNode left, right;
		      public TreeNode(int val) {
		          this.val = val;
		          this.left = this.right = null;
		      }
		  }
	 
    public String serialize(TreeNode root) {
        // write your code here
    	String result = "";
    	if(root == null) {
    		return result;
    	}
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
    	List<TreeNode> list = new LinkedList<TreeNode>();
    	queue.add(root);
    	TreeNode node;
    	while(!queue.isEmpty()) {
    		node = queue.poll();
    		list.add(node);
    		if(node != null) {
    			queue.add(node.left);
    			queue.add(node.right);
    		}
    	}
    	
    	for(int i = 0; i < list.size(); ++i) {
    		if(list.get(i) != null) {
    			result += String.valueOf(list.get(i).val);
    		} else {
    			result += "#";
    		}
    		if(i != list.size() - 1) {
    			result += ",";
    		}
    	}
    	
    	return result;
    }
    
    /**
     * This method will be invoked second, the argument data is what exactly
     * you serialized at method "serialize", that means the data is not given by
     * system, it's given by your own serialize method. So the format of data is
     * designed by yourself, and deserialize it here as you serialize it in 
     * "serialize" method.
     */
    public TreeNode deserialize(String data) {
        // write your code here
    	if(data.length() == 0) {
    		return null;
    	}
    	String[] list = data.split(",");
    	if(list.length == 0) {
    		return null;
    	}
    	Queue<TreeNode> stack = new LinkedList<TreeNode>();
    	TreeNode root;
    	if(!list[0].equals("#")) {
        	root = new TreeNode(Integer.parseInt(list[0]));
        	stack.add(root);
    	} else {
    		return null;
    	}
    	for(int i = 0; i < list.length; ) {
    		TreeNode node = stack.poll();
    		++i;
    		if(i < list.length) {
    			TreeNode leftNode;
    			if(!list[i].equals("#")) {
    				leftNode = new TreeNode(Integer.parseInt(list[i]));
        			node.left = leftNode;
        			stack.add(leftNode);
    			} else  {
    				node.left = null;
    			}	
    		}
    		++i;
    		if(i < list.length) {
    			TreeNode rightNode;
    			if(!list[i].equals("#")) {
    				rightNode = new TreeNode(Integer.parseInt(list[i]));
        			node.right = rightNode;
        			stack.add(rightNode);
    			} else {
    				node.right = null;
    			}
    		}
    	}
    	
    	return root;
    }
    
    public static void main(String[] args) {
    	Solution temp = new Solution();
    	temp.deserialize("");
    }
   
}
