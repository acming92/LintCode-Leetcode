/**
 * Definition for ListNode.

 */ 
public class Solution {

	public class ListNode {
	    int val;
	    ListNode next;
		ListNode(int val) {
	       this.val = val;
	       this.next = null;
		 }
	}
	 
    public ListNode detectCycle(ListNode head) {  
        // write your code here
    	if(head == null || head.next == null) {
    		return null;
    	}
    	
    	ListNode fast = head.next;
    	ListNode slow = head;
    	
    	while(fast != slow) {
    		if(fast == null || fast.next == null) {
    			return null;
    		}
    		slow = slow.next;
    		fast = fast.next;
    	}
    	
    	while(head.next != slow) {
    		slow = slow.next;
    		head = head.next;
    	}
    	
    	return head;
    }
}

