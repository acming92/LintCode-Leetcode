
public class Solution {
	
	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int val) {
	       this.val = val;
	       this.next = null;
	    }
	}

    public boolean hasCycle(ListNode head) {  
        // write your code here
    	if(head == null || head.next == null) {
    		return false;
    	}
    	
    	ListNode fast = head.next;
    	ListNode slow = head;
    	while(slow != fast) {
    		if(fast == null || fast.next == null) {
    			return false;
    		}
    		slow = slow.next;
    		fast = fast.next.next;
    	}
    	
    	return true;
    }
    
    public static void main(String[] args) {
    	
    }
}

