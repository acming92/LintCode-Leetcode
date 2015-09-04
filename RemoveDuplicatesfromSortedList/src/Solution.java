public class Solution {

	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
		   val = x;
	       next = null;
	    }
	}
	 
    public static ListNode deleteDuplicates(ListNode head) { 
        // write your code here
    	if(head == null) {
    		return null;
    	}
    	
    	ListNode dummyNode = new ListNode(0);
    	dummyNode.next = head;
    	ListNode iter = dummyNode;
    	while(head != null) {
    		if(iter != dummyNode) {
    			if(head.val == iter.val) {
    				iter.next = head.next;
    				head = head.next;
    			} else {
    				iter = iter.next;
    				head = head.next;
    			}
    		} else {
    			iter = iter.next;
				head = head.next;
    		}
    	}
    	
    	return dummyNode.next;
    }  
    
    public static void main() {
    	
    }
}
