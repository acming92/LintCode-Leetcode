
public class Solution {

	public class ListNode {
		int val;
	    ListNode next;
	    ListNode(int val) {
	        this.val = val;
	        this.next = null;
		}
	}
	 
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // write your code here
    	if(l1 == null) {
    		return l2;
    	}
    	
    	if(l2 == null) {
    		return l1;
    	}
    	
    	ListNode dummyNode = new ListNode(0);
    	ListNode iter = dummyNode;
    	while(l1 != null && l2 != null) {
    		if(l1.val <= l2.val) {
    			iter.next = l1;
    			l1 = l1.next;
    		} else {
    			iter.next = l2;
    			l2 = l2.next;
    		}
    		iter = iter.next;
    	}
    	
    	if(l1 == null && l2 == null) {
    		return dummyNode.next;
    	}
    	
    	if(l1 == null) {
    		while(l2 != null) {
    			iter.next = l2;
    			l2 = l2.next;
    			iter = iter.next;
    		}
    	}
    	
    	if(l2 == null) {
    		while(l1 != null) {
    			iter.next = l1;
    			l1 = l1.next;
    			iter = iter.next;
    		}
    	}
    	
    	return dummyNode.next;
    }
    
    public static void main(String[] args) {
    	
    }
}