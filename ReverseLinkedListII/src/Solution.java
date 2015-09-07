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
	 
    public ListNode reverseBetween(ListNode head, int m , int n) {
        // write your code
    	if(head == null) {
    		return head;
    	}
    	
    	ListNode dummyNode = new ListNode(0);
    	dummyNode.next = head;
    	ListNode iter = dummyNode;
    	ListNode reverseHead = null, reverseTail = null;
    	int i = 0;
    	while(iter.next != null) {
    		i++;
    		ListNode focusiter = iter.next;
    		if(i == m) {
    			reverseHead = iter;
    			reverseTail = focusiter;
    			iter = iter.next;
    		}
    		else if(i > m && i <= n) {
    			reverseTail.next = focusiter.next;
    			focusiter.next = reverseHead.next;
    			reverseHead.next = focusiter;
    			iter = reverseTail;
    		} else {
    			iter = iter.next;
    		}
    	}
    	
    	if(i == n - 1) {
    		iter.next = null;
    		reverseHead.next = iter;
    	}
    	
    	return head;
    }
    
    public static void main(String[] args) {
    	
    }
}
