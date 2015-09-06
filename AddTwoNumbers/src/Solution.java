/**
 * Definition for singly-linked list.

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
	 
    public ListNode addLists(ListNode l1, ListNode l2) {
        // write your code here
    	if(l1 == null) {
    		return l2;
    	}
    	
    	if(l2 == null) {
    		return l1;
    	}
    	
    	ListNode head = l1;
    	int add = 0;
    	while(l1.next != null && l2.next != null) {
    		int val = l1.val + l2.val + add;
    		l1.val = val % 10;
    		add = val / 10;
    		l1 = l1.next;
    		l2 = l2.next;
    	}
    	
    	if(l1.next == null && l2.next == null) {
    		int val = l1.val + l2.val + add;
    		l1.val = val % 10;
    		add = val / 10;
    		if(add >= 1) {
    			ListNode newNode = new ListNode(add);
    			l1.next = newNode;
    		}
    		return head;
    	}
    	
    	if(l1.next == null) {
    		int val = l1.val + l2.val + add;
    		l1.val = val % 10;
    		add = val / 10;
    		l2 = l2.next;
    		while(l2 != null) {
    			val = l2.val + add;
    			l2.val = val % 10;
    			add = val / 10;
    			l1.next = l2;
    			l2 = l2.next;
    			l1 = l1.next;
    		}
    		
    		if(add > 0)
    		{
    			ListNode newNode = new ListNode(add);
    			l1.next = newNode;
    		}
    		return head;
    	}
    	
    	if(l2.next == null) {
    		int val = l1.val + l2.val + add ;
    		l1.val = val % 10;
    		add = val / 10;
    		l1 = l1.next;
    		while(l1.next == null) {
    			if(add == 0) {
    				break;
    			}
    			val = l1.val + add;
    			l1.val = val % 10;
    			add = val / 10;
    		}
    		
    		val = l1.val + add;
    		l1.val = val % 10;
    		add = val / 10;
    		if(add > 0) {
    			ListNode newNode = new ListNode(add);
    			l1.next = newNode;
    		}
    		
    		return head;
    	}	
    	
    	return null;
    }
    
    public static void main(String[] args) {
    	
    }
}
