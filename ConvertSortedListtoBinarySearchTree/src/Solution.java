
public class Solution {

	public class ListNode {
		int val;
		ListNode next;
		ListNode(int val) {
		    this.val = val;
		    this.next = null;
		}
	}
	
	public class TreeNode {
		 public int val;
		 public TreeNode left, right;
		 public TreeNode(int val) {
		     this.val = val;
		     this.left = this.right = null;
		 }
	}
	
	public ListNode currentNode;
	
	public int getListLength(ListNode head) {
		int size = 0;
		while(head != null) {
			size++;
			head = head.next;
		}
		
		return size;
	}
	 
    public TreeNode sortedListToBST(ListNode head) {  
        // write your code here
    	if(head == null) {
    		return null;
    	}
    	int size = getListLength(head);
    	currentNode = head;

    	return getBBinaryTreeHelper(size);
    }
    
    public TreeNode getBBinaryTreeHelper(int size) {
    	if(size <= 0) {
    		return null;
    	}
    	TreeNode left = getBBinaryTreeHelper(size / 2);
    	TreeNode root = new TreeNode(currentNode.val);
    	currentNode = currentNode.next;
    	TreeNode right = getBBinaryTreeHelper(size - size / 2 - 1);
    	root.left = left;
    	root.right = right;
    	
    	return root;
    }
    
    public static void main(String[] args) {
    	
    }
}
