
public class Solution {

	 public static class ListNode {
	    int val;
		ListNode next;
		ListNode(int val) {
		    this.val = val;
	        this.next = null;
	    }
	}
	 
	    public ListNode insertionSortList(ListNode head) {
	        // write your code here
	    	if(head == null) {
	    		return null;
	    	}
	    	ListNode dummyNode = new ListNode(0);
	    	while(head != null) {
	    		if(dummyNode.next == null) {
	    			dummyNode.next = head;
	    			head = head.next;
	    			if(head != null) {
	    				dummyNode.next.next = null;
	    			}
	    		} else {
	    			ListNode iter = dummyNode;
	    			while(iter.next != null && iter.next.val < head.val) {
	    				iter = iter.next;
	    			}
	    			ListNode nextNode = head.next;
	    			head.next = iter.next;
	    			iter.next = head;
	    			head = nextNode;
	    		}
	    	}
	    	
	    	return dummyNode.next;
	    }
    
    public static void main(String[] args) {
    	int[] input = {3, 2, 4};
    	ListNode dummyNode = new ListNode(0);
    	ListNode iter = dummyNode;
    	for(int i = 0; i < input.length; ++i) {
    		ListNode node = new ListNode(input[i]);
    		iter.next = node;
    		iter = iter.next;
    	}
    	
    	Solution temp = new Solution();
    	temp.insertionSortList(dummyNode.next);
    }
}