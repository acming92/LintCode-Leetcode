import java.lang.annotation.Target;

public class Solution {

	public class ListNode {
		int val;
		ListNode next;
		ListNode(int val) {
			this.val = val;
			this.next = null;
		}
	}
	 
    ListNode removeNthFromEnd(ListNode head, int n) {
        // write your code here
    	if(head == null) {
    		return null;
    	}
    	
    	ListNode iter = head;
    	ListNode dummy = new ListNode(0);
    	dummy.next = head;
    	ListNode target = dummy;
    	
    	while(--n >= 0) {
    		iter = iter.next;
    	}
    	
    	while(iter != null) {
    		iter = iter.next;
    		target = target.next;
    	}

        target.next = target.next.next;
    	
    	return dummy.next;
    }
    
    public static void main(String[] args) {
    	Solution temp = new Solution();
    }
}
