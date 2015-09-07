
public class Solution {

	public class ListNode {
	   int val;
	   ListNode next;
	   ListNode(int x) {
	      val = x;
		  next = null;
	   }
	}
	
	public int getListLength(ListNode head) {
		int count = 0;
		ListNode iter = head;
		while(iter != null) {
			count++;
			iter = iter.next;
		}
		
		return count;
	}
	 
    public ListNode rotateRight(ListNode head, int k) {
        // write your code here
    	if(head == null || head.next == null) {
    		return head;
    	}
    	
    	ListNode dummyNode = new ListNode(0);
    	ListNode iter = dummyNode;
    	ListNode tail = dummyNode;
    	int size = getListLength(head);
    	k = k % size;
    	dummyNode.next = head;
    	int count = 0;
    	while(count < k) {
    		if(head == null) {
    			head = dummyNode.next;
    		} else {
    			head = head.next;
    			tail = tail.next;
    		}
    		
    		count++;
    	}
    	
    	while(head != null) {
    		head = head.next;
    		iter = iter.next;
    		tail = tail.next;
    	}
    	
    	tail.next = dummyNode.next;
    	dummyNode.next = iter.next;
        iter.next = null;
    		
    	return dummyNode.next;
    }
    
    public static void main(String[] args) {
    	
    }
}
