import Solution.ListNode;

/**
 * Definition for ListNode

 */
public class Solution {

	public class ListNode {
		int val;
	    ListNode next;
        ListNode(int x) {
        	val = x;
        	next = null;
	    }
    }
	 
	public static ListNode deleteDuplicates(ListNode head) {
    	if(head == null || head.next == null) {
    		return null;
    	}
    	
    	ListNode dummyNode = new ListNode(0);
    	dummyNode.next = head;
    	head = dummyNode;
    	
    	while(head.next != null && head.next.next != null) {
    		if(head.next.val == head.next.next.val) {
    			int val = head.next.val;
    			while(head.next != null && head.next.val == val) {
    				head.next = head.next.next;
    			}
    		} else {
    			head = head.next;
    		}
    	}
    	
    	return dummyNode.next;
    }
    
    public static void main(String[] args) {
    	
    }
}