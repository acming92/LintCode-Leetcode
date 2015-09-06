public class Solution {

	public class ListNode {
	   int val;
	   ListNode next;
	   ListNode(int val) {
	      this.val = val;
	      this.next = null;
	   }
	}
	 
    public ListNode reverse(ListNode head) {
        // write your code here
    	if(head == null) {
    		return null;
    	}
    	
    	ListNode dummyNode = new ListNode(0);
    	
    	while(head != null) {
    		ListNode node = new ListNode(head.val);
    		node.next = dummyNode.next;
    		dummyNode.next = node;
    		head = head.next;
    	}
    	
    	return dummyNode.next;
    }
    
    public static void main(String[] args) {
    	
    }
}
