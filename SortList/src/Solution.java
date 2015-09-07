
public class Solution {
	public class ListNode {
	   int val;
	   ListNode next;
	   ListNode(int val) {
	      this.val = val;
	      this.next = null;
	   }
	}
	
	public ListNode findMid(ListNode head) {
		if(head == null) {
			return null;
		}
		ListNode dummyNode = new ListNode(0);
		dummyNode.next = head;
		ListNode fast = dummyNode, slow = dummyNode;
		while(slow != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow;
	}
	
	public ListNode merge(ListNode head1, ListNode head2) {
		if(head1 == null) {
			return head2;
		}
		if(head2 == null) {
			return head1;
		}
		
		ListNode dummyNode = new ListNode(0);
		ListNode iter = dummyNode;
		
		while(head1 != null && head2 != null) {
			if(head1.val < head2.val) {
				iter.next = head1;
				iter = iter.next;
				head1 = head1.next;
			} else {
				iter.next = head2;
				iter = iter.next;
				head2 = head2.next;
			}
		}
		
		while(head1 != null) {
			iter.next = head1;
			iter = iter.next;
			head1 = head1.next;
		}
		
		while(head2 != null) {
			iter.next = head2;
			iter = iter.next;
			head2 = head2.next;
		}
		
		return dummyNode.next;
	}
	
	
    public ListNode sortList(ListNode head) {  
        // write your code here
    	if(head == null) {
    		return null;
    	}
    	
    	ListNode mid = findMid(head);
    	ListNode back = sortList(mid.next);
    	mid.next = null;
    	ListNode font = sortList(head);
    	return merge(font, back);
    }
    
    public static void main(String[] args) {
    	
    }
}
