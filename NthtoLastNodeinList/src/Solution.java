 
public class Solution {

	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int val) {
	    	this.val = val;
		    this.next = null;
		}
	}
	 
    ListNode nthToLast(ListNode head, int n) {
        // write your code here
    	if(head == null) {
    		return null;
    	}
    	
    	ListNode dummyNode = new ListNode(0);
    	dummyNode.next = head;
    	ListNode iter = dummyNode;
    	while(--n > 0) {
    		head = head.next;
    	}
    	
    	while(head != null) {
    		head = head.next;
    		iter = iter.next;
    	}
    	
    	return iter;
    }
    
    public static void main(String[] args) {
    	
    }
}